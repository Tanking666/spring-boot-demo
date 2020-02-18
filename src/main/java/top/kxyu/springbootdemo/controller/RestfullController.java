package top.kxyu.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.kxyu.springbootdemo.model.Video;
import top.kxyu.springbootdemo.service.VideoService;

/**
 * @INFO:
 * @author: KXY
 * @Date: Created in 2020/2/18 14:10
 */
@RestController
public class RestfullController {

	@Autowired
	VideoService videoService;

	@PostMapping("/test/rest/add/{id}")
	public Object addVideo(@PathVariable("id") String id) {
		Video v = videoService.getVideo(id);
		if (v == null) {
			return ("null");
		} else {
			System.out.println(v.toString());
			return v;
		}
	}

	@DeleteMapping("/test/rest/del/{id}")
	public Object delVideo(@PathVariable("id") String id) {
		Video v = videoService.getVideo(id);
		if (v == null) {
			return ("null");
		} else {
			System.out.println(v.toString());
			return v;
		}
	}

	@PutMapping("/test/rest/update/{id}")
	public Object updateVideo(@PathVariable("id") String id) {
		Video v = videoService.getVideo(id);
		if (v == null) {
			return ("null");
		} else {
			System.out.println(v.toString());
			return v;
		}
	}

	@GetMapping("/test/rest/select/{id}")
	public Object getVideo(@PathVariable("id") String id) {
		Video v = videoService.getVideo(id);
		if (v == null) {
			return ("null");
		} else {
			System.out.println(v.toString());
			return v;
		}
	}
}
