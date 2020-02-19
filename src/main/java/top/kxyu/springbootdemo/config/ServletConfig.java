package top.kxyu.springbootdemo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import top.kxyu.springbootdemo.filter.RealFilter;
import top.kxyu.springbootdemo.servlet.RealServlet;

/**
 * @INFO:
 * @author: KXY
 * @Date: Created in 2020/2/19 23:30
 */
@Configuration
public class ServletConfig {
	@Bean
	public ServletRegistrationBean realServletRegistrationBean(){
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new RealServlet(),"/test/servlet2");
		return servletRegistrationBean;
	}
	@Bean
	public FilterRegistrationBean realFilterRegistrationBean(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new RealFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}
//	手写编码过滤器  配置就行了
//	@Bean
//	public FilterRegistrationBean filterRegistrationBean(){
//		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//		characterEncodingFilter.setForceEncoding(true);
//		characterEncodingFilter.setEncoding("UTF-8");
//		filterRegistrationBean.setFilter(characterEncodingFilter);
//		filterRegistrationBean.addUrlPatterns("/*");
//		return filterRegistrationBean;
//	}
}
