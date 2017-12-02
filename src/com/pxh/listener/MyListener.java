package com.pxh.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *Servlet的监听器Listener，它是实现了javax.servlet.ServletContextListener接口的服务器端程序，
 *它也是随web应用的启动而启动，只初始化一次，
 *随web应用的停止而销毁。主要作用是：做一些初始化的内容添加工作、设置一些基本的内容、
 *比如一些参数或者是一些固定的对象等等。
 *
 */
@WebListener
public final class MyListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
        System.out.println("我是监听器 我被终止了");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         System.out.println("我是监听 我初始化了");
    }
	
}
