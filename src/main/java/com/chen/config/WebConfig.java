package com.chen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 启动springMVC组件的方式不止一种，以前是通过<mvc:annotation-driven> 启动注解驱动的springMVC的
 * @author chencheng
 *
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.chen")
public class WebConfig extends WebMvcConfigurerAdapter {
	/**
	 * 配置jsp视图解析器,它会查找jsp文件 
	 * 并在视图名称上加上特定的前缀和后缀
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver =new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

	/**
	 * 配置静态资源处理
	 * 要求将对静态资源的请求转发到servlet容器中默认的servlet上，而不是使用dispatcherServlet本身来处理此类请求
	 */
	public void configureDefaultServletHanding(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	
	
}
