package priv.wzq.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import priv.wzq.ssm.mapper.ZbitemMapper;
import priv.wzq.ssm.po.Zbitem;
import priv.wzq.ssm.service.ZbService;

public class ZbServiceImpl implements ZbService{
	@Autowired ZbitemMapper zbitemMapper;
	
	public void insert(Zbitem zbitem){
		zbitemMapper.insert(zbitem);
	}
	
}
