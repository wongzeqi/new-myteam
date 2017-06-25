package priv.wzq.ssm.service;

import java.util.List;

import priv.wzq.ssm.po.ExOpenid;
import priv.wzq.ssm.po.Qjitem;
import priv.wzq.ssm.po.QjitemsCostom;

public interface QjItemService extends BaseService{
	/**
	 * 查看所有请假条目
	 * @return
	 */
	List<Qjitem> getAllQjitems();
	/**
	 * 查看所有人的该类请假条目
	 * @return
	 */
	List<Qjitem> getAllQjitemsByType(String type);
	
	/**
	 * 
	 * @param schoolNumber
	 * @param type
	 * @return
	 */
	List<Qjitem> getAllQjitemsBySchoolAndType(Qjitem qjitem);
	/**
	 * 查询数量根据请假类型
	 * @param schoolNumber
	 * @param type
	 * @return
	 */
	int getCountByTypeAndSchoolNumber(QjitemsCostom qjitemsCostom);
	
	void insert(Qjitem qjitem);
	 /**
	  * 获取请假信息  关联查询成员信息
	  * @return
	  */
	List<QjitemsCostom> getQjitemsAndSchoolNumberName();
	/**
	 * 查询请假条目更具学号
	 * @return
	 */
	List <QjitemsCostom> getAllQjitemsBySchoolNumber(String schoolnumber);
	
	/**
	 * 根据类别查询所以请假信息
	 * @param param
	 * @return
	 */
	List<QjitemsCostom> getAllQjitemsCoustomByType(String param);
	/**
	 * 根据openid查看请假次数
	 * @param string
	 * @return
	 */
	int getQjTimes(ExOpenid openid);
}
