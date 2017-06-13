package com.chen.web;

import  static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//这是 oHomeController的类注解版
@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {
	/**
	 * 拆分了 @RequestMapping 并将其路径部分放到了类级别上
	 * 视图名为home
	 * @return
	 */
	@RequestMapping(method = GET)
	public String home(){
		return "home";
	}
	
	
	
}
