package priv.wzq.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import priv.wzq.ssm.po.ExOpenid;
import priv.wzq.ssm.po.Qjitem;
import priv.wzq.ssm.po.QjitemExample;
import priv.wzq.ssm.po.QjitemsCostom;

public interface QjitemMapper {
    int countByExample(QjitemExample example);

    int deleteByExample(QjitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Qjitem record);

    int insertSelective(Qjitem record);

    List<Qjitem> selectByExample(QjitemExample example);

    Qjitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Qjitem record, @Param("example") QjitemExample example);

    int updateByExample(@Param("record") Qjitem record, @Param("example") QjitemExample example);

    int updateByPrimaryKeySelective(Qjitem record);

    int updateByPrimaryKey(Qjitem record);

	List<Qjitem> getAllQjitems();

	List<Qjitem> getAllQjitems(String type);


	List<Qjitem> getAllQjitemsBySchoolAndType(Qjitem qjitem);
	

	List<QjitemsCostom> getQjitemsAndSchoolNumberName();
	/**
	 * 根据类型和学号查看请假次数
	 * @param qjitem
	 * @return
	 */
	int getCountByTypeAndSchoolNumber(QjitemsCostom qjitemsCostom);
	
	
	/**
	 * 根据学号获取请假信息
	 */
	List <QjitemsCostom> getAllQjitemsBySchoolNumber(String schoolnumber);
	/**
	 * 根据请假类型获取请假信息
	 */
	List<QjitemsCostom> getAllQjitemsCoustomByType(String param);
	/**
	 * 根据openid查询请假次数
	 * @param openid
	 * @return
	 */
	int getQjTimes(ExOpenid openid);
	/**
	 *  根据类型查询请假次数
	 * @param openid
	 * @return
	 */
	int getQjTimesByType(ExOpenid openid);
	/**
	 * 根据学号查询请假次数
	 * @param openid
	 * @return
	 */
	int getQjTimesBySchoolNumber(ExOpenid openid);
	
}