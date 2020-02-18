package top.kxyu.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2020/2/17 22:36
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
@Controller
public class ConfigInfoController {

	//	注入配置中的自定义参数
	@Value("${ali.token}")
	private String token;

	@Value("${ali.accessId}")
	private String accessId;

	@Autowired
	ConfigInfoController2 configInfoController2;

	@RequestMapping("/test/config")
	@ResponseBody
	public String config() {

		return token + "    " + accessId + "--------------" + configInfoController2.toString();
	}
}
