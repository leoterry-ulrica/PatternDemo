package com.dist.pattern.demo.factory.abstractfactory;

public class Factory1 implements AbstractFactory {

	@Override
	public ProduceA createProduceA() {
		// TODO Auto-generated method stub
		return new ProduceA1();
	}

	@Override
	public ProduceB createProduceB() {
		// TODO Auto-generated method stub
		return new ProduceB1();
	}

}
