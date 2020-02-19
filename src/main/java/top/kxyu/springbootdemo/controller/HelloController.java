package top.kxyu.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2020/2/17 22:32
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
//只返回字符串/json 使用下面注解
//@RestController
@RestController
public class HelloController {


	@RequestMapping(value = "/test/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "Hello";
	}

	@GetMapping("/test/get")
	public String get() {
		return "Get";
	}

	@PostMapping("/test/post")
	public String post() {
		return "post";
	}

	//修改操作 一般被post代替
	@PutMapping("/test/put")
	public String put() {
		return "put";
	}

	//删除操作 一般被get代替  传个ID
	@DeleteMapping("/test/delete")
	public String delete() {
		return "delete";
	}
}
