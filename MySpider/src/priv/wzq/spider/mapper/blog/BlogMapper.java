package priv.wzq.spider.mapper.blog;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import priv.wzq.spider.model.blog.Blog;
import priv.wzq.spider.model.blog.BlogExample;
import priv.wzq.spider.model.blog.BlogVo;

public interface BlogMapper {
    int countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExampleWithBLOBs(BlogExample example);

    List<Blog> selectByExample(BlogExample example);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);

    List<Blog> listAllBlogs(BlogVo blogVo);

	int getAllBlogsCount(BlogVo blogVo);

	List<Blog> searchLike(BlogVo blogVo);
	
	int getSearchBlogsCount (BlogVo blogVo);

}