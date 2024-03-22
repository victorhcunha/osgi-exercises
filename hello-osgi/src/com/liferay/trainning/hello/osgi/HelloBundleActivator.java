package com.liferay.trainning.hello.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloBundleActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hey Hello World!!");
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Hey Goodbye World!!");
	}

}
