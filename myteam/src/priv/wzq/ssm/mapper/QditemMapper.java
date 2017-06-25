package priv.wzq.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import priv.wzq.ssm.po.ExQditems;
import priv.wzq.ssm.po.Qditem;
import priv.wzq.ssm.po.QditemExample;

public interface QditemMapper {
    int countByExample(QditemExample example);

    int deleteByExample(QditemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Qditem record);

    int insertSelective(Qditem record);

    List<Qditem> selectByExample(QditemExample example);

    Qditem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Qditem record, @Param("example") QditemExample example);

    int updateByExample(@Param("record") Qditem record, @Param("example") QditemExample example);

    int updateByPrimaryKeySelective(Qditem record);

    int updateByPrimaryKey(Qditem record);

	List<ExQditems> getAllExQditemsByType(String type);
}