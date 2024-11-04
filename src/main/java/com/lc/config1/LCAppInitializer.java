package com.lc.config1;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.lc.config1.LoveCalculatorAppConfig;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {LoveCalculatorAppConfig.class};
		return arr;
	}
	@Override
	protected String[] getServletMappings() {
		String arr[]= {"/lc.com/*"};
		return arr;
	}
}
