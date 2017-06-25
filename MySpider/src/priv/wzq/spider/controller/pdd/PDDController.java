package priv.wzq.spider.controller.pdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import priv.wzq.spider.crawer.pdd.PDDCrawler;
import priv.wzq.spider.mapper.news.NewsMapper;
import priv.wzq.spider.model.pdd.PDDPage;

@Controller
@RequestMapping("/crawl")
public class PDDController {
	@Autowired NewsMapper newsMapper;
	@RequestMapping("/crawl.action")
	public ModelAndView crawl(PDDPage page) throws Exception{
		ModelAndView m = new ModelAndView();
		m.addObject("page",new PDDCrawler().Crawer(page));
		m.setViewName("/WEB-INF/index.jsp");
		return m;
	}
	
	
	@RequestMapping("/newsContent.action")
	public ModelAndView newsContent(String newsContent) throws Exception{
		ModelAndView m = new ModelAndView();
		m.addObject("newsContent",newsContent);
		m.setViewName("/WEB-INF/news.jsp");
		return m;
	}
	
	
	
	
}
