package top.kxyu.springbootdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.kxyu.springbootdemo.model.Video;

@Mapper
public interface VideoMapper {
	long countByExample(VideoExample example);

	int deleteByExample(VideoExample example);

	int deleteByPrimaryKey(String id);

	int insert(Video record);

	int insertSelective(Video record);

	List<Video> selectByExample(VideoExample example);

	List<Video> selectAll();

	Video selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

	int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

	int updateByPrimaryKeySelective(Video record);

	int updateByPrimaryKey(Video record);
}