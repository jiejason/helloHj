package com.yammii.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyInterceptor implements HandlerInterceptor {
	
	/**
	 * Controller方法调用之前
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(request.getRequestURL());	//打印：http://192.168.0.172:8089/test/123
		System.out.println(request.getRequestURI());	//结果：/test/123
		
		String token = request.getParameter("token");
		String timestamp = request.getParameter("timestamp");
		String restaurantId = request.getParameter("restaurantId");
		
		if (token == null && timestamp == null && restaurantId == null) {
			//获取请求数据
			getResult(request);	//session的id
		} else {
			
		}
		return true;
	}
	
	//判断非空
	private String getResult(HttpServletRequest request) throws Exception {
		
		String token = request.getParameter("token");
		String time = request.getParameter("time");

		System.out.println(token);
		System.out.println(time);
		
		return "";
	}
	
	/**
	 * Controller方法调用之后
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	/**
	 * 主要是用于进行资源清理工作
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
