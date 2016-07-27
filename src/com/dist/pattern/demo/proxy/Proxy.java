package com.dist.pattern.demo.proxy;

public class Proxy implements Subject{

	private Subject subject = null;
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		
		before();
		this.subject.request();
		after();
		
	}
	/**
	 * 访问控制
	 */
	private void before() {
		
		System.out.println("license验证通过");
	}
	
	private void after() {
		
		System.out.println("运行时间");
	}
}
