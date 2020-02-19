package top.kxyu.springbootdemo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter; 过时
import top.kxyu.springbootdemo.interceptor.LoginInterceptor;

/**
 * @INFO:
 * @author: KXY
 * @Date: Created in 2020/2/19 20:02
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		String[] addPathPatterns={
				"/test/**"
		};
		String[] excludePathPatterns={
				"/test/hello"
		};
		//包含路径
		//不包含路径
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
	}
}
