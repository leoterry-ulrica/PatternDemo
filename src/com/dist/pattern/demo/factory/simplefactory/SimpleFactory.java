package com.dist.pattern.demo.factory.simplefactory;

public class SimpleFactory {

	public static Produce createByType(String typeName) {
		
		switch (typeName) {
		case "A":
			return new ProduceA();
		case "B":
			return new ProduceB();
		default:
			break;
		}
		return null;
	}
}
