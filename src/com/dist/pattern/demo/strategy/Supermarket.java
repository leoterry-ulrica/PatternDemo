package com.dist.pattern.demo.strategy;

/**
 * 超市
 * 
 * @author weifj
 *
 */
public class Supermarket {

	public Supermarket() {

	}

	public void getPrice(PriceStrategy strategy, Double price) {

		strategy.getPrice(price);
	}

	@Deprecated
	public void getPrice(String type, Double price) {

		switch (type) {
		case "原价":
			System.out.println("原价：" + price);
			break;
		case "促销价":
			System.out.println("促销价：" + price * 0.7);
		default:
		case "双十一":
			System.out.println("促销价：" + price * 0.85);
			break;
		}
	}

}
