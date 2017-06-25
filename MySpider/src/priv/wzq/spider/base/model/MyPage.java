package priv.wzq.spider.base.model;

import java.util.List;

public class MyPage<T> {
	protected List<T> results = null;

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}
	
}
