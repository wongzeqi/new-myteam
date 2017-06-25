package priv.wzq.spider.crawer.pdd;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import priv.wzq.spider.base.AbstractSpider;
import priv.wzq.spider.base.ICrawer;
import priv.wzq.spider.model.pdd.PDDPage;
import priv.wzq.spider.model.pdd.PDDResult;

/**
 * 用于封装结果对象
 * @author Administrator
 *
 */
public  class PDDCrawler extends AbstractSpider<PDDResult> implements ICrawer<PDDResult>{
	/**
	 * 往参数list里面装东西
	 */
	final static String  baseUrl = "http://www.panduoduo.net/s/name/";
	//给我一个url我给你一个doc对象
	
	//测试
	private static Document getDocTest(String url) throws Exception{
		String result = crawl(url).replace("&nbsp;", "").replace("<br/>", "");
		Document doc = Jsoup.parse(result);
		doc.setBaseUri(baseUrl);
		return doc;
	}
	/**
	 * 封装结果对象
	 * @param content
	 * @param pagenumber
	 * @return
	 * @throws Exception
	 */
	public PDDPage Crawer(PDDPage page) throws Exception {
		String url = null;
		if(page.getContent()==null){
			page.setContent("java");
		}
		if(page.getCurrent()!=0){
			url= baseUrl+page.getContent()+"/"+page.getCurrent()+"/";
		}else{
			page.setCurrent(1);
			url = baseUrl+page.getContent()+"/";
		}
		
		Document doc = getDoc(url);
		doc.setBaseUri(baseUrl);
		List<String> hrefs = Crawer4Href(doc, PDDResult.getHrefSeletor());
		List<String> times = Crawer4Date(doc, PDDResult.getTimeSeletor());
		List<String> titles = Crawer4Title(doc, PDDResult.getTitleSeletor());
		List<String> sizes = Crawer4Test(doc, PDDResult.getSizeSeletor());
		List<String> pantitles =Crawer4Title(doc,PDDResult.getPanSeletor());
		List<PDDResult> results = new ArrayList<PDDResult>();
		for(int i = 0;i<hrefs.size();i++){
			PDDResult pddResult = new PDDResult();
			Document d = getDoc(hrefs.get(i));
			pddResult.setHref(getAHref(d,PDDResult.getSecondHrefSeletor()));
			pddResult.setSize(sizes.get(i));
			pddResult.setTime(times.get(i));
			pddResult.setTitle(titles.get(i));
			pddResult.setPan(pantitles.get(i));
			results.add(pddResult);
		}
		page.setCurrent(Integer.parseInt(getAText(doc, PDDPage.getCurrentSelector()).replace("第", "").replace("页", "")));
		page.setTotal(Integer.parseInt(getAText(doc, PDDPage.getTotalSelector()).replace("共", "").replace("项", "")));
		page.setPageCount(Integer.parseInt(getAText(doc, PDDPage.getPageCountSelector()).replace("共", "").replace("页", "")));
		page.setResults(results);
		
		return page;
	}
	//测试
	public static void main(String[] args) throws Exception {
		Document doc = getDocTest("http://www.panduoduo.net/s/name/java");
		String a =getAText(doc, PDDPage.getTotalSelector());
		String b = getAText(doc, PDDPage.getCurrentSelector());
		String c = getAText(doc, PDDPage.getPageCountSelector());
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
