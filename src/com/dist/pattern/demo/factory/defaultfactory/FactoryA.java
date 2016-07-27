package com.dist.pattern.demo.factory.defaultfactory;

public class FactoryA implements Factory {

	@Override
	public Produce create() {
		// TODO Auto-generated method stub
		return new ProduceA();
	}

}
