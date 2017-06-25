package priv.wzq.spider.mapper.news;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import priv.wzq.spider.model.news.News;
import priv.wzq.spider.model.news.NewsExample;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExampleWithBLOBs(NewsExample example);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
    List<News>  getAllNews();

	List<News> searchNews(String content);

	News getNewsDetailById(int id);
	
	
    
}