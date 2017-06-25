package priv.wzq.spider.base;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public abstract class AbstractSpider<T> {

	protected static Document getDoc(String url) throws Exception {
		String result = crawl(url).replace("&nbsp;", "");
		Document doc = Jsoup.parse(result);
		return doc;
	}

	/**
	 * 给定url获取返回的结果result
	 * 
	 * @param url
	 * @return
	 * @throws Exception
	 */
	protected static String crawl(String url) throws Exception {
		HttpGet httpget = new HttpGet(url);
		httpget.addHeader("Accept", "text/html");
		httpget.addHeader("Accept-Charset", "utf-8");
		httpget.addHeader("Accept-Encoding", "gzip");
		httpget.addHeader("Accept-Language", "en-US,en");
		httpget.addHeader(
				"User-Agent",
				"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.22 (KHTML, like Gecko) Chrome/25.0.1364.160 Safari/537.22");

		try (CloseableHttpClient httpClient = HttpClientBuilder.create()
				.build();
				CloseableHttpResponse httpResponse = httpClient.execute(httpget)) {
			String result = EntityUtils.toString(httpResponse.getEntity(),
					"UTF-8");
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 获取链接属性
	 * 
	 * @param list
	 * @param doc
	 * @param selector
	 * @return
	 */
	protected static List<String> Crawer4Href(Document doc, String selector) {
		Elements as = doc.select(selector);
		List<String> list = new ArrayList<String>();
		for (Element e : as) {
			list.add(e.absUrl("href"));
		}
		return list;
	}

	/**
	 * 获取一个href属性
	 * 
	 * @param doc
	 * @param selector
	 * @return
	 */
	protected static String getAHref(Document doc, String selector) {
		Elements as = doc.select(selector);
		return as.get(0).attr("href");
	}

	protected static String getAText(Document doc, String selector) {
		Elements as = doc.select(selector);
		if (as.size() == 1) {
			return as.get(0).text();
		} else {
			return "0";
		}

	}

	protected String getInnerHtml(Document doc, String selector) {
		Elements as = doc.select(selector);
		if (as.size() == 1) {
			return as.get(0).html();
		} else {
			return "";
		}
	}

	/**
	 * 给定三个参数返回属性为title的内容
	 * 
	 * @param list
	 * @param doc
	 * @param selector
	 * @return
	 */
	protected static List<String> Crawer4Title(Document doc, String selector) {
		Elements as = doc.select(selector);
		List<String> list = new ArrayList<String>();
		for (Element e : as) {
			list.add(e.attr("title"));
		}
		return list;
	}

	/**
	 * 正则获取日期
	 * 
	 * @param list
	 * @param doc
	 * @param selector
	 * @return
	 */
	protected static List<String> Crawer4Date(Document doc, String selector) {
		Elements as = doc.select(selector);
		List<String> list = new ArrayList<String>();
		for (Element e : as) {
			Pattern p = Pattern.compile("\\d{4}(\\-|\\/|.)\\d{1,2}\\1\\d{1,2}");
			Matcher m = p.matcher(e.text());
			if (m.find()) {
				list.add(m.group());
			} else {
				list.add(null);
			}
		}
		return list;
	}

	/**
	 * 获取文本
	 * 
	 * @param list
	 * @param doc
	 * @param selector
	 * @return
	 */
	protected static List<String> Crawer4Test(Document doc, String selector) {
		Elements as = doc.select(selector);

		List<String> list = new ArrayList<String>();
		for (Element e : as) {
			list.add(e.text());
		}
		return list;
	}

}
