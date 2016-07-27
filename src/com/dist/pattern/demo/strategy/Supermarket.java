package com.dist.pattern.demo.strategy;

/**
 * ����
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
		case "ԭ��":
			System.out.println("ԭ�ۣ�" + price);
			break;
		case "������":
			System.out.println("�����ۣ�" + price * 0.7);
		default:
		case "˫ʮһ":
			System.out.println("�����ۣ�" + price * 0.85);
			break;
		}
	}

}
