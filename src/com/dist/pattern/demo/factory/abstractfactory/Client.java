package com.dist.pattern.demo.factory.abstractfactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory factory = new Factory1();
		ProduceA produceA1 = factory.createProduceA();
		ProduceB produceB1 = factory.createProduceB();
		System.out.println("第一个工厂运作：");
		System.out.println(produceA1.getId() +"  ,  "+ produceA1.getName());
		System.out.println(produceB1.getId() +"  ,  "+ produceB1.getName());
		
		
		factory = new Factory2();
		ProduceA produceA2 = factory.createProduceA();
		ProduceB produceB2 = factory.createProduceB();
		System.out.println("第二个工厂运作：");
		System.out.println(produceA2.getId() +"  ,  "+ produceA2.getName());
		System.out.println(produceB2.getId() +"  ,  "+ produceB2.getName());
	}

}
