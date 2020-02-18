package top.kxyu.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.kxyu.springbootdemo.mapper.VideoMapper;
import top.kxyu.springbootdemo.model.Video;
import top.kxyu.springbootdemo.service.VideoService;

import java.util.List;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2020/2/17 23:43
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
@Service
public class VideoServiceImpl implements VideoService {


	@Autowired
	private VideoMapper videoMapper;

	//唯二泛型
	//	private RedisTemplate<String, String> redisTemplate;
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	@Override
	public List<Video> getAllVideo() {
		return videoMapper.selectAll();
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int del(String id) {
		int res = videoMapper.deleteByPrimaryKey(id);
		int i = 1 / 0;
		return res;
	}

	@Override
	public Video getVideo(String id) {
		Video video = videoMapper.selectByPrimaryKey(id);
		return video;
	}

	@Override
	public List<Video> getVideoRedis() {
		//字符串 序列化器
		RedisSerializer redisSerializer = new StringRedisSerializer();
		//key序列化
		redisTemplate.setKeySerializer(redisSerializer);


		List<Video> list = (List<Video>) redisTemplate.opsForValue().get("AllVideo");
		//高并发穿透问题
		//双重检测锁
		if (null == list) {
			synchronized (this) {
				list = (List<Video>) redisTemplate.opsForValue().get("AllVideo");
				if (null == list) {
					list = videoMapper.selectAll();
					System.out.println("MySql");
					redisTemplate.opsForValue().set("AllVideo", list);
				}
			}
		}
		return list;
	}
}
