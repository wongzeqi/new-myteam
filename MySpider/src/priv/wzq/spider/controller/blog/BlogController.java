package priv.wzq.spider.controller.blog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import priv.wzq.spider.crawer.blog.BlogCrawler;
import priv.wzq.spider.mapper.blog.BlogMapper;
import priv.wzq.spider.mapper.news.CommonMapper;
import priv.wzq.spider.model.blog.Blog;
import priv.wzq.spider.model.blog.BlogVo;
import priv.wzq.utils.Page;

@Controller
@RequestMapping("/blog")
public class BlogController {
	//
	@Autowired CommonMapper commonMapper;
	@Autowired BlogMapper blogMapper;
	@RequestMapping("/b")
	public String b(){
		return "/WEB-INF/blog/details.jsp";
	}
	/**
	 * 爬取网页
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getBlogs")
	public String getBlogs() throws Exception{
		//http://blog.csdn.net/mobile/newarticle.html?&page=2
		String url = "http://blog.csdn.net/code/newarticle.html?&page=";
		for(int i=140;i<=255;i++){
			String url2 = url +i;
			List<Blog> list = BlogCrawler.getList(url2);
			
			for(Blog b :list ){
				b.setBlogSort("编程语言");
				b.setWebId(2);
				if(!b.getBlogContent().trim().equals("")){
					try{
						blogMapper.insertSelective(b);
					}catch(Exception e){  
						continue;
					}
				}
			}
			System.out.println(i);
			
		}
		
		return "index.jsp";
	}
	
	/**
	 * 分页列出所有的博客
	 * @param blogVo
	 * @return
	 */
	@RequestMapping("/listAllBlogs.action")
	public ModelAndView listAllBlogs(BlogVo blogVo){
		if(blogVo.getPage()==null){
			blogVo.setPage(new Page());
		}
		if(blogVo.getBlog()==null){
			blogVo.setBlog(new Blog());
		}
		ModelAndView m = new ModelAndView();
		List<Blog> blogs = blogMapper.listAllBlogs(blogVo);
		int totalItemCount = blogMapper.getAllBlogsCount(blogVo);
		m.addObject("pageCount", blogVo.getPage().getPageCount());
		if(totalItemCount%blogVo.getPage().getItemCount()==0){
			m.addObject("totalPage", totalItemCount/blogVo.getPage().getItemCount());
		}else{
			m.addObject("totalPage", totalItemCount/blogVo.getPage().getItemCount()+1);
		}
		m.addObject("blogs", blogs);
		m.addObject("totalItemCount", totalItemCount);
		m.addObject("blogTitle", blogVo.getBlog().getBlogTitle());
		m.setViewName("/WEB-INF/blog/index.jsp");
		return m;
	}
	
	/**
	 * 根据id获取博客的详细内容
	 * @param bolg_id
	 * @return
	 */
	@RequestMapping("/getBlogContent.action")
	public ModelAndView getBlogContent(int blog_id){
		ModelAndView m = new ModelAndView();
		Blog blog = blogMapper.selectByPrimaryKey(blog_id);
		m.addObject("blog", blog);
		m.setViewName("/WEB-INF/blog/details.jsp");
		return m;
	}
	
	
	
}
