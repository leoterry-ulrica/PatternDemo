package com.dist.pattern.demo.factory.simplefactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produce produceA = SimpleFactory.createByType("A");
		System.out.println(produceA.getId() +"  ,  "+ produceA.getName());
		
		Produce produceB = SimpleFactory.createByType("B");
		System.out.println(produceB.getId() +"  ,  "+ produceB.getName());
	}

}
