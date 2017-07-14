package priv.wzq.spider.crawer.blog;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;

import priv.wzq.spider.base.AbstractSpider;
import priv.wzq.spider.model.blog.Blog;
import priv.wzq.spider.model.blog.Blogweb;

public class BlogCrawler extends AbstractSpider<Blog>{
	private Blogweb blogweb;
	private List<Blog> blogs  = new ArrayList<Blog>();
	public void crawlerBlog() throws Exception{
		Document doc = getDoc(blogweb.getBlogListUrl());
		doc.setBaseUri("http://blog.csdn.net/mobile/");
		List<String> hrefs = Crawer4Href(doc, blogweb.getBlogHrefSelector());
		List<String> titles = Crawer4Test(doc, blogweb.getBlogTitleSelector());
		List<String> dis = Crawer4Test(doc, blogweb.getBlogDiscriptionSelector());
		for (int i = 0; i < hrefs.size(); i++) {
			Blog b= new Blog();
			b.setBlogTitle(titles.get(i));
			b.setBlogContentHref(hrefs.get(i));
			b.setBlogDiscription(dis.get(i));
			b.setBlogContent(getInnerHtml(getDoc(hrefs.get(i)),blogweb.getBlogContentSelector()));
			blogs.add(b);
		}
		
	}
	/**
	 * 测试
	 * @param args
	 * @throws Exception
	 */
//	public static void main(String[] args) throws Exception {
//		
//	}
//	
	public static List<Blog> getList(String url) throws Exception{
		Blogweb bl = new Blogweb();
		bl.setBlogListUrl(url);
		bl.setBlogContentSelector("#main .main #article_details .article_content");
		bl.setBlogHrefSelector(".blog_home_main .blog_l #listBot .blog_list .tracking-ad a");
		bl.setBlogTitleSelector(".blog_home_main .blog_l #listBot .blog_list .tracking-ad a");
		bl.setBlogDiscriptionSelector(".blog_home_main .blog_l #listBot .blog_list dd .blog_list_c");
		BlogCrawler bc = new BlogCrawler(bl);
		bc.crawlerBlog();
		List<Blog> blogs = bc.getBlogs();
		return blogs;
	}
	
	
	public static void main(String[] args) throws Exception {
		while(true){
			Document doc = getDoc("https://www.baidu.com/s?wd=%E7%8E%8B%E5%98%89%E7%90%AA%2C%E4%B8%AA%E4%BA%BA%E5%8D%9A%E5%AE%A2&pn=20&oq=%E7%8E%8B%E5%98%89%E7%90%AA%2C%E4%B8%AA%E4%BA%BA%E5%8D%9A%E5%AE%A2&ie=utf-8&rsv_idx=1&rsv_pq=9dca8c5f00003837&rsv_t=3c3f8jtWkUPnKbIQTUD868JN%2BM%2FN5hxaNNaUq0pq7KtHxuzu1G0uWfWmueo");
			doc.setBaseUri("https://www.baidu.com");
			
			String href =  getHref(doc, ".t a");
			Document doc1 = getDoc(href);
			
			System.out.println(doc1);
			Thread.sleep(5000) ;
		}
	}
	
	
	//构造函数传递blogweb对象
	public BlogCrawler(Blogweb blogweb) {
		this.blogweb = blogweb;
		
	}
	
	
	//获取blogs
	public List<Blog> getBlogs() {
		return blogs;
	}
	
	
	
}
