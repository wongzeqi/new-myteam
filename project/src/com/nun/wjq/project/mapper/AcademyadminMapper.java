package com.nun.wjq.project.mapper;

import com.nun.wjq.project.model.Academyadmin;
import com.nun.wjq.project.model.AcademyadminExample;
import com.nun.wjq.project.parameter.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AcademyadminMapper {
    int countByExample(AcademyadminExample example);

    int deleteByExample(AcademyadminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Academyadmin record);

    int insertSelective(Academyadmin record);

    List<Academyadmin> selectByExample(AcademyadminExample example);

    Academyadmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Academyadmin record, @Param("example") AcademyadminExample example);

    int updateByExample(@Param("record") Academyadmin record, @Param("example") AcademyadminExample example);

    int updateByPrimaryKeySelective(Academyadmin record);

    int updateByPrimaryKey(Academyadmin record);

	Academyadmin login(User user);
}