package top.kxyu.springbootdemo.service;

import top.kxyu.springbootdemo.model.Video;

import java.util.List;

/**
 * @INFO:
 * @author: KXY
 * @Date: Created in 2020/2/17 23:42
 */
public interface VideoService {
	public List<Video> getAllVideo();

	public int del(String id);

	public Video getVideo(String id);

	public List<Video> getVideoRedis();


}
