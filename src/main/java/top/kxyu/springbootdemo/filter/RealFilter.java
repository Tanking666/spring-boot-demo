package top.kxyu.springbootdemo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @INFO:
 * @author: KXY
 * @Date: Created in 2020/2/19 23:21
 */

public class RealFilter implements Filter {
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
	                     FilterChain filterChain) throws IOException, ServletException {
		System.out.println("这是个纯净的Servlet过滤器");
		filterChain.doFilter(servletRequest,servletResponse);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void destroy() {

	}
}
