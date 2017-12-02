package com.pxh.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 过滤所有配置
 * 对字符编码的过滤
 */
@WebFilter("/IndexServlet")
public final class MyFilter2 implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter2() {
        System.out.println("我是过滤器的构造函数1");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("我是过滤器，我被销毁1");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("我过滤器，正在执行初始化11");
		chain.doFilter(request, response);
		System.out.println("我过滤器，正在执行初始化22");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("我是过滤器，我被初始化了1");
	}

}
