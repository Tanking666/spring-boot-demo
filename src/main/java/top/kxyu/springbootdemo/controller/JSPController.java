package top.kxyu.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2020/2/17 22:59
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
@Controller
public class JSPController {

	@GetMapping("/test/index")
	public String index(Model model) {
		model.addAttribute("msg","Controller Info");
		return "index";
	}
}
