package priv.wzq.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import priv.wzq.ssm.mapper.OpenidMapper;
import priv.wzq.ssm.po.ExOpenid;
import priv.wzq.ssm.po.Openid;
import priv.wzq.ssm.service.OpenidService;

public class OpenidServiceImpl implements OpenidService{
	@Autowired OpenidMapper openidMapper;
	/**
	 * 插入openid并且权限设为最小，关注的时候调用 表示 该用户是游客
	 * @param openid
	 */
	
	public void insertOpenid(Openid openid){
		openid.setRole(0);//默认是最小权限
		openidMapper.insert(openid);
	}
	/**
	 * 根据openid删除
	 * @param openid
	 */
	public void deleteByOpenid(String openid){
		if(openid!=null&&openid!=""){
			openidMapper.deleteByOpenid(openid);
		}
	}
	/**
	 * 根据openid查询角色
	 * @param openid
	 * @return
	 */
	public int getRoleByOpenid(String openid){
		if(openid!=null&&openid!=""){
			if(openidMapper.getOpenidEneityByOpenid(openid)!=null){
				return openidMapper.getRoleByOpenid(openid);
			}
		}
		return 0;
	}
	@Override
	public void setRoleByOpenid(Openid openid) {
		// TODO Auto-generated method stub
		if(openid.getOpenId()!=null&&openid.getOpenId()!=""){
			openidMapper.setRoleByOpenid(openid);
		}
	}
	@Override
	public void setSchoolNumber(Openid openid) {
		openid.setRole(1);//绑定之后默认将权限设置为0
		openidMapper.setSchoolNumber(openid);
	}
	@Override
	public void setRoleBySchoolNumber(Openid openid) {
		openidMapper.setRoleBySchoolNumber(openid);
		
	}
	@Override
	public Openid getOpenidEneityByOpenid(String openid) {
		// TODO Auto-generated method stub
		return openidMapper.getOpenidEneityByOpenid(openid);
	}
	
	@Override
	public String getSchoolNumberByOpenid(String openid) {
		return openidMapper.getSchoolNumberByOpenid(openid);
	}
	@Override
	public List<ExOpenid> getAdminInfo() {
		return openidMapper.getAdminInfo();
	}
	
}
