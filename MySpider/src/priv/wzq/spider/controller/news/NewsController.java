package priv.wzq.spider.controller.news;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import priv.wzq.spider.crawer.news.NewsCrawler;
import priv.wzq.spider.mapper.blog.BlogMapper;
import priv.wzq.spider.mapper.news.CommonMapper;
import priv.wzq.spider.mapper.news.NewsMapper;
import priv.wzq.spider.model.news.Common;
import priv.wzq.spider.model.news.News;

@Controller
@RequestMapping("/news")
@Component("taskJob") 
public class NewsController {
	
	@Autowired NewsMapper newsMapper;
	@Autowired CommonMapper commonMapper;
	@Autowired BlogMapper blogMapper;
	@RequestMapping("/b")
	public String b(){
		return "/WEB-INF/blog/details.jsp";
	}

//	@RequestMapping("/getBlogs")
//	public String getBlogs() throws Exception{
//		//http://blog.csdn.net/mobile/newarticle.html?&page=2
//		String url = "http://blog.csdn.net/code/newarticle.html?&page=";
//		for(int i=140;i<=255;i++){
//			String url2 = url +i;
//			List<Blog> list = BlogCrawler.getList(url2);
//			
//			for(Blog b :list ){
//				b.setBlogSort("编程语言");
//				b.setWebId(2);
//				if(!b.getBlogContent().trim().equals("")){
//					try{
//						blogMapper.insertSelective(b);
//					}catch(Exception e){
//						continue;
//					}
//				}
//			}
//			System.out.println(i);
//			
//		}
//		
//		return "index.jsp";
//	}
	/**
	 * 列出所有的新闻
	 * @return
	 */
	@RequestMapping("/list.action")
	public ModelAndView listNews(){
		List<News> newsList  = newsMapper.getAllNews();
		ModelAndView m = new ModelAndView();
		m.addObject("newsList", newsList);
		m.setViewName("/WEB-INF/page/list.jsp");
		return m;
	}
	/**
	 * 关键字模糊查询内容
	 * @param content
	 * @return
	 */
	@RequestMapping("/search.action")
	public ModelAndView searchNews(String content){
		List<News> newsList  = newsMapper.searchNews(content);
		ModelAndView m = new ModelAndView();
		m.addObject("newsList", newsList);
		m.setViewName("/WEB-INF/page/list.jsp");
		return m;
	}
	/**
	 * 查看正文的内容
	 * @param id
	 * @return
	 */
	@RequestMapping("/news/details.action")
	public ModelAndView getNewsDetail(int id){
		ModelAndView m = new ModelAndView();
		m.addObject("news",newsMapper.getNewsDetailById(id));
		m.setViewName("/WEB-INF/page/arctile.jsp");
		return m;
	}
	
	/////////////////////////////////////////////////////////////////////
	
	/**
	 * 爬取内容定时任务
	 * @return
	 * @throws Exception
	 */
	//@Scheduled(cron = "5 * * * * ?")
	public void task(){
		System.out.println("task zxzcsaf");
		try {
			crawlNewsList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping("/newsList.action")
	public ModelAndView crawlNewsList() throws Exception{
		ModelAndView m = new ModelAndView();
		List<News> list = new ArrayList<News>();
		list = new NewsCrawler().CrawlerNews();
		for(News n : list){
			newsMapper.insertSelective(n);
			System.out.println(n.getId());//主键返回
			List<Common> commons = new ArrayList<Common>();
			commons = new NewsCrawler().CrawlerCommons(n.getNewscontenthref(), n.getNewscontenthref());
			for(Common c : commons){
				c.setId(n.getId());
				commonMapper.insert(c);
			}
		}
		m.addObject("newsList",list);
		m.setViewName("/WEB-INF/newsList.jsp");
		return m;
	}
	
}
