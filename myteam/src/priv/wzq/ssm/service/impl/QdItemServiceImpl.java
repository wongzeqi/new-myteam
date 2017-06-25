package priv.wzq.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import priv.wzq.ssm.mapper.QditemMapper;
import priv.wzq.ssm.po.ExQditems;
import priv.wzq.ssm.po.Qditem;
import priv.wzq.ssm.service.QdItemService;

public class QdItemServiceImpl implements QdItemService{
	@Autowired QditemMapper qditemMapper;

	@Override
	public void addQditem(Qditem qditem) {
		qditemMapper.insert(qditem);
	}

	@Override
	public List<ExQditems> getAllExQditemsByType(String param) {
		return qditemMapper.getAllExQditemsByType(param);
	}

	@Override
	public List<ExQditems> getAllQjitemsBySchoolNumber(String sn) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
