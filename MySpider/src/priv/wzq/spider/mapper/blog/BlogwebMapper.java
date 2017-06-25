package priv.wzq.spider.mapper.blog;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import priv.wzq.spider.model.blog.Blogweb;
import priv.wzq.spider.model.blog.BlogwebExample;

public interface BlogwebMapper {
    int countByExample(BlogwebExample example);

    int deleteByExample(BlogwebExample example);

    int deleteByPrimaryKey(Integer webId);

    int insert(Blogweb record);

    int insertSelective(Blogweb record);

    List<Blogweb> selectByExample(BlogwebExample example);

    Blogweb selectByPrimaryKey(Integer webId);

    int updateByExampleSelective(@Param("record") Blogweb record, @Param("example") BlogwebExample example);

    int updateByExample(@Param("record") Blogweb record, @Param("example") BlogwebExample example);

    int updateByPrimaryKeySelective(Blogweb record);

    int updateByPrimaryKey(Blogweb record);
}