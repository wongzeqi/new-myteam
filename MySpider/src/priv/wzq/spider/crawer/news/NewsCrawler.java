package priv.wzq.spider.crawer.news;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.junit.Test;

import priv.wzq.spider.base.AbstractSpider;
import priv.wzq.spider.model.news.Common;
import priv.wzq.spider.model.news.News;

public class NewsCrawler extends AbstractSpider<News>{
	//新浪新闻爬虫
	public List<News> CrawlerNews() throws Exception{
		List<News> newsList = new ArrayList<News>();
		Document doc = getDoc("http://www.guancha.cn/ZhengZhi/list_1.shtml");
		doc.setBaseUri("http://www.guancha.cn/");
		//获取新闻的正文链接
		List<String> hrefs = Crawer4Href(doc, News.getNewscontenthrefSelector());
		//获取时间
		List<String> mydate = Crawer4Date(doc, News.getDateSelector());
		//获取标题
		List<String> titles = Crawer4Test(doc, News.getTitleSelector());
		//获取
		List<String> views = Crawer4Test(doc, News.getViewSelector());
		//获取正文
		for(int i = 0;i<hrefs.size();i++){
			News n = new News();
			Document d = getDoc(hrefs.get(i));
			n.setNewscontent(getInnerHtml(d,News.getNewscontentSelector()));
			n.setDate(mydate.get(i));
			n.setTitle(titles.get(i));
			n.setView(views.get(i));
			n.setNewscontenthref(hrefs.get(i));
			newsList.add(n);
		}
		return newsList;
	}
	
	/**
	 * 获取评论列表
	 * @param url
	 * @param baseUrl
	 * @return
	 * @throws Exception
	 */
	public List<Common> CrawlerCommons(String url,String baseUrl) throws Exception{
		List<Common> commonList = new ArrayList<Common>();
		Document doc = getDoc("http://www.guancha.cn/politics/2017_05_27_410380.shtml");
		doc.setBaseUri(baseUrl);
		List<String> commons = Crawer4Test(doc,Common.getCommoncontentSelector());
		System.out.println(Common.getCommoncontentSelector());
		for(String s:commons){
			Common c = new Common();
			c.setCommoncontent(s);
			commonList.add(c);
		}
		return commonList;
	}
	
	@Test
	public void fun() throws Exception{
		NewsCrawler nc = new NewsCrawler();
		nc.CrawlerNews();
	}
	
}
