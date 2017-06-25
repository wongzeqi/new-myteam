package priv.wzq.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import priv.wzq.ssm.mapper.QjitemMapper;
import priv.wzq.ssm.po.ExOpenid;
import priv.wzq.ssm.po.Qjitem;
import priv.wzq.ssm.po.QjitemsCostom;
import priv.wzq.ssm.service.QjItemService;

public class QjItemServiceImpl implements QjItemService{
	@Autowired QjitemMapper qjitemMapper;
	@Override
	public List<Qjitem> getAllQjitems() {
		return qjitemMapper.getAllQjitems();
	}

	@Override
	public List<Qjitem> getAllQjitemsByType(String type) {
		return qjitemMapper.getAllQjitems(type);
	}


	@Override
	public List<Qjitem> getAllQjitemsBySchoolAndType(Qjitem qjitem) {
		return qjitemMapper.getAllQjitemsBySchoolAndType(qjitem);
	}


	@Override
	public void insert(Qjitem qjitem) {
		qjitemMapper.insert(qjitem);
	}

	@Override
	public List<QjitemsCostom> getQjitemsAndSchoolNumberName() {
		return	qjitemMapper.getQjitemsAndSchoolNumberName();
	}

	@Override
	public int getCountByTypeAndSchoolNumber(QjitemsCostom qjitemsCostom) {
		return  qjitemMapper.getCountByTypeAndSchoolNumber(qjitemsCostom);
	}

	@Override
	public List<QjitemsCostom> getAllQjitemsBySchoolNumber(String schoolnumber) {
		// TODO Auto-generated method stub
		return qjitemMapper.getAllQjitemsBySchoolNumber(schoolnumber);
	}

	@Override
	public List<QjitemsCostom> getAllQjitemsCoustomByType(String param) {
		return qjitemMapper.getAllQjitemsCoustomByType(param);
	}

	@Override
	public int getQjTimes(ExOpenid openid) {
		if(openid.getOpenid()!=null&&openid.getQjtype()==null&&openid.getSchoolnumber()==null){
			return qjitemMapper.getQjTimes(openid);
		}else if(openid.getQjtype()!=null&&openid.getOpenid()!=null&&openid.getSchoolnumber()==null){
			return qjitemMapper.getQjTimesByType(openid);
		}else if(openid.getSchoolnumber()!=null&&openid.getQjtype()==null&&openid.getOpenid()==null){
			return qjitemMapper.getQjTimesBySchoolNumber(openid);
		}else{
			return 0;
		}
	}
	
}
