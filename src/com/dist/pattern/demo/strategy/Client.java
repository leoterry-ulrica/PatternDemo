package com.dist.pattern.demo.strategy;

public class Client {

	public static void main(String[] args) {
		
		PriceStrategy strategy = null;
		Supermarket supermarket = new Supermarket();
		
		// 原价
		strategy = new OriginalStrategy();
		supermarket.getPrice(strategy, 200D);
		
		// 促销价
		strategy = new PromotionStrategy();
		supermarket.getPrice(strategy, 200D);
		
		// 双十一
		strategy = new Double11Strategy();
		supermarket.getPrice(strategy, 200D);

	}

}
