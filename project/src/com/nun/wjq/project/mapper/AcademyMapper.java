package com.nun.wjq.project.mapper;

import com.nun.wjq.project.model.Academy;
import com.nun.wjq.project.model.AcademyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcademyMapper {
    int countByExample(AcademyExample example);

    int deleteByExample(AcademyExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Academy record);

    int insertSelective(Academy record);

    List<Academy> selectByExample(AcademyExample example);

    Academy selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Academy record, @Param("example") AcademyExample example);

    int updateByExample(@Param("record") Academy record, @Param("example") AcademyExample example);

    int updateByPrimaryKeySelective(Academy record);

    int updateByPrimaryKey(Academy record);
}