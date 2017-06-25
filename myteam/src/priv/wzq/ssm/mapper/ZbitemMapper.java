package priv.wzq.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import priv.wzq.ssm.po.Zbitem;
import priv.wzq.ssm.po.ZbitemExample;

public interface ZbitemMapper {
    int countByExample(ZbitemExample example);

    int deleteByExample(ZbitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zbitem record);

    int insertSelective(Zbitem record);

    List<Zbitem> selectByExample(ZbitemExample example);

    Zbitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zbitem record, @Param("example") ZbitemExample example);

    int updateByExample(@Param("record") Zbitem record, @Param("example") ZbitemExample example);

    int updateByPrimaryKeySelective(Zbitem record);

    int updateByPrimaryKey(Zbitem record);
}