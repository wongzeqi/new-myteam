package priv.wzq.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import priv.wzq.ssm.po.ExOpenid;
import priv.wzq.ssm.po.Openid;
import priv.wzq.ssm.po.OpenidExample;

public interface OpenidMapper {
    int countByExample(OpenidExample example);

    int deleteByExample(OpenidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Openid record);

    int insertSelective(Openid record);

    List<Openid> selectByExample(OpenidExample example);

    Openid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Openid record, @Param("example") OpenidExample example);

    int updateByExample(@Param("record") Openid record, @Param("example") OpenidExample example);

    int updateByPrimaryKeySelective(Openid record);

    int updateByPrimaryKey(Openid record);

	void deleteByOpenid(String openid);

	int getRoleByOpenid(String openid);

	void setRoleByOpenid(Openid openid);
	
	
	void setSchoolNumber(Openid openid);

	void setRoleBySchoolNumber(Openid openid);

	Openid getOpenidEneityByOpenid(String openid);

	String getSchoolNumberByOpenid(String openid);

	List<ExOpenid> getAdminInfo();
}