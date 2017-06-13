package com.chen.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * AbstractAnnotationConfigDispatcherServletInitializer 同时会创建 dispatcherServlet、contextLoaderListener 
 * 使用这个类的目的是为了代替传统web.xml 
 * @author chencheng
 *
 */
public class SpitterWebAppInitializer
	extends AbstractAnnotationConfigDispatcherServletInitializer{

	/**
	 * 返回带有@configuration 注解的类，将会用来配置 contextLoaderListener 创建的bean
	 * contextLoaderListener 加载应用中其他的bean（除了dispatcherServlet加载的），通常是驱动应用后端的中间层和数据层组件
	 * @return
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}

	/**
	 * 返回带有@configuration 注解的类，将会用来定义dispatcherServlet 应用上下文中的bean
	 * dispatcherServlet 加载包含web组件的bean ，如控制器，视图解析器、处理器映射等
	 * @return
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
