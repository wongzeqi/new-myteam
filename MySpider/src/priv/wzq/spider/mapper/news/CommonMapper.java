package priv.wzq.spider.mapper.news;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import priv.wzq.spider.model.news.Common;
import priv.wzq.spider.model.news.CommonExample;

public interface CommonMapper {
    int countByExample(CommonExample example);

    int deleteByExample(CommonExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Common record);

    int insertSelective(Common record);

    List<Common> selectByExample(CommonExample example);

    Common selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Common record, @Param("example") CommonExample example);

    int updateByExample(@Param("record") Common record, @Param("example") CommonExample example);

    int updateByPrimaryKeySelective(Common record);

    int updateByPrimaryKey(Common record);
}