package com.dist.pattern.demo.factory.abstractfactory;

public class Factory2 implements AbstractFactory {

	@Override
	public ProduceA createProduceA() {
		// TODO Auto-generated method stub
		return new ProduceA2();
	}

	@Override
	public ProduceB createProduceB() {
		// TODO Auto-generated method stub
		return new ProduceB2();
	}

}
