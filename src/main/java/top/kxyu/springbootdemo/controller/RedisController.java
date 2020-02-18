package top.kxyu.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.nio.ch.ThreadPool;
import top.kxyu.springbootdemo.mapper.VideoMapper;
import top.kxyu.springbootdemo.service.VideoService;

import java.util.concurrent.*;

/**
 * @INFO:
 * @author: KXY
 * @Date: Created in 2020/2/18 15:54
 */
@RestController
public class RedisController {

	@Autowired
	VideoService videoService;

	@GetMapping("/test/redisvideo")
	public Object getAllVideos() {
		return videoService.getVideoRedis();
	}

	@GetMapping("/test/redistest")
	public Object getAllVideosT() {
//		Executors.newFixedThreadPool(25);
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(50, 100,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());
//		threadPoolExecutor.submit(new Runnable() {
//			@Override
//			public void run() {
//				videoService.getVideoRedis();
//			}
//		});
		threadPoolExecutor.submit(() -> {
			for(int i=0; i<100;i++){
				videoService.getVideoRedis();
				System.out.println(i);
			}
		});
		return videoService.getVideoRedis();
	}


}
