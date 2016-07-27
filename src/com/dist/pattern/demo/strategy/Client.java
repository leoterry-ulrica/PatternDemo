package com.dist.pattern.demo.strategy;

public class Client {

	public static void main(String[] args) {
		
		PriceStrategy strategy = null;
		Supermarket supermarket = new Supermarket();
		
		// ԭ��
		strategy = new OriginalStrategy();
		supermarket.getPrice(strategy, 200D);
		
		// ������
		strategy = new PromotionStrategy();
		supermarket.getPrice(strategy, 200D);
		
		// ˫ʮһ
		strategy = new Double11Strategy();
		supermarket.getPrice(strategy, 200D);

	}

}
