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
		Document doc = getDoc("http://blog.csdn.net/?ref=toolbar_logo&page=2");
		doc.setBaseUri("http://blog.csdn.net/yanmiao0715/article/details/73278169");
		System.out.println(doc);
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
