package top.kxyu.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.kxyu.springbootdemo.service.VideoService;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2020/2/17 23:35
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
@RestController
public class MyBatisDemoController {

	@Autowired
	VideoService videoService;

	@GetMapping("/test/allvideo")
	public Object getAllVideos() {
		return videoService.getAllVideo();
	}

	@GetMapping("/test/delvideo")
	public Object delVideo() {
		return videoService.del("00317abe-5161-11ea-8743-0026833a2819");
	}
}
