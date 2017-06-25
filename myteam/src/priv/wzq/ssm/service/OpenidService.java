package priv.wzq.ssm.service;

import java.util.List;

import priv.wzq.ssm.po.ExOpenid;
import priv.wzq.ssm.po.Openid;

public interface OpenidService{
	 void insertOpenid(Openid openid);
	
	 void deleteByOpenid(String openid);
	 int getRoleByOpenid(String openid);
	
	 void setRoleByOpenid(Openid openid);
	 void setSchoolNumber(Openid openid);
	 
	 
	 void setRoleBySchoolNumber(Openid openid);
	 
	 /**
	  * 根据openid 获取openid对象
	  * @return
	  */
	 Openid getOpenidEneityByOpenid(String openid);
	 /**
		 * 根据openid获取学号
		 */
	String getSchoolNumberByOpenid(String openid);

	List<ExOpenid> getAdminInfo();
}
