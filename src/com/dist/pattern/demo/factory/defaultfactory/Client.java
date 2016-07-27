package com.dist.pattern.demo.factory.defaultfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory factory = new FactoryA();
		Produce produceA = factory.create();
		System.out.println(produceA.getId() +"  ,  "+ produceA.getName());
		
		factory = new FactoryB();
		Produce produceB = factory.create();
		System.out.println(produceB.getId() +"  ,  "+ produceB.getName());
	}

}
