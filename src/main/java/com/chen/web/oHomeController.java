package com.chen.web;

import  static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//  = @Component
@Controller
public class oHomeController {
	
	/**
	 * value 属性 指定了这个方法所要处理的请求路径
	 * method 属性细化了它所处理的HTTP方法 
	 * 返回的string值 "home" 会被springMvc 解读为要渲染的师徒名称
	 * dispaatcherServlet会要求视图解析器将这个逻辑名称解析为实际的视图  
	 * @return
	 */
	@RequestMapping(value = "/" , method = GET)
	public String home(){
		return "home";
	}
	
	
	
}
