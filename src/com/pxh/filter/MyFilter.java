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
 * 对字符编码的过滤 ，对字符验证过滤等
 */
@WebFilter("/*")
public final class MyFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter() {
        System.out.println("我是过滤器的构造函数");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("我是过滤器，我被销毁");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("我过滤器，正在执行初始化1");
		chain.doFilter(request, response);
		System.out.println("我过滤器，正在执行初始化2");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("我是过滤器，我被初始化了");
	}

}
