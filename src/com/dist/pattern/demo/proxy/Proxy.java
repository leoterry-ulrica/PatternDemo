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
	 * ���ʿ���
	 */
	private void before() {
		
		System.out.println("license��֤ͨ��");
	}
	
	private void after() {
		
		System.out.println("����ʱ��");
	}
}
