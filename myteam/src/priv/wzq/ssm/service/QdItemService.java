package priv.wzq.ssm.service;

import java.util.List;

import priv.wzq.ssm.po.ExQditems;
import priv.wzq.ssm.po.Qditem;

public interface QdItemService extends BaseService{

	void addQditem(Qditem qditem);
	/**
	 * 根据类型查询所以的签到信息
	 * @param param
	 * @return
	 */
	List<ExQditems> getAllExQditemsByType(String param);
	/**
	 * 查看所有请假信息
	 * @param sn
	 * @return
	 */
	List<ExQditems> getAllQjitemsBySchoolNumber(String sn);
	
}
