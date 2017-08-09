package com.nun.wjq.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nun.wjq.project.model.Projectfile;
import com.nun.wjq.project.model.ProjectfileExample;
import com.nun.wjq.project.result.Pst;
import com.nun.wjq.project.utils.Page;

public interface ProjectfileMapper {
    int countByExample(ProjectfileExample example);

    int deleteByExample(ProjectfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projectfile record);

    int insertSelective(Projectfile record);

    List<Projectfile> selectByExample(ProjectfileExample example);

    Projectfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projectfile record, @Param("example") ProjectfileExample example);

    int updateByExample(@Param("record") Projectfile record, @Param("example") ProjectfileExample example);

    int updateByPrimaryKeySelective(Projectfile record);

    int updateByPrimaryKey(Projectfile record);

	List<Pst> selectFileListByStage(Page page);
}