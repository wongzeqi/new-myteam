package com.nun.wjq.project.mapper;

import com.nun.wjq.project.model.Sonmeun;
import com.nun.wjq.project.model.SonmeunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SonmeunMapper {
    int countByExample(SonmeunExample example);

    int deleteByExample(SonmeunExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Sonmeun record);

    int insertSelective(Sonmeun record);

    List<Sonmeun> selectByExample(SonmeunExample example);

    Sonmeun selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Sonmeun record, @Param("example") SonmeunExample example);

    int updateByExample(@Param("record") Sonmeun record, @Param("example") SonmeunExample example);

    int updateByPrimaryKeySelective(Sonmeun record);

    int updateByPrimaryKey(Sonmeun record);

	List<Sonmeun> getSonmeuns4();
	List<Sonmeun> getSonmeuns3();
	List<Sonmeun> getSonmeuns2();
	List<Sonmeun> getSonmeuns1();
}