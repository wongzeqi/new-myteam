package com.nun.wjq.project.result;

import java.util.List;

import com.nun.wjq.project.model.Parentmeun;
import com.nun.wjq.project.model.Sonmeun;

public class Meun {
	private List<Parentmeun> pmeun;
	private List<Sonmeun> smeun;
	public List<Parentmeun> getPmeun() {
		return pmeun;
	}
	public void setPmeun(List<Parentmeun> pmeun) {
		this.pmeun = pmeun;
	}
	public List<Sonmeun> getSmeun() {
		return smeun;
	}
	public void setSmeun(List<Sonmeun> smeun) {
		this.smeun = smeun;
	}
	
}
