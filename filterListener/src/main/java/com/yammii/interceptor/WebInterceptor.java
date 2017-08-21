package com.yammii.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration   //标注此文件为一个配置项，spring boot才会扫描到该配置。该注解类似于之前使用xml进行配置
public class WebInterceptor extends WebMvcConfigurerAdapter {
	
	@Autowired
	private MyInterceptor myInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(myInterceptor).addPathPatterns("/test/{id}");
		registry.addInterceptor(myInterceptor).addPathPatterns("/restaurants/{restaurantId}/***");
		
		super.addInterceptors(registry);
	}
}
