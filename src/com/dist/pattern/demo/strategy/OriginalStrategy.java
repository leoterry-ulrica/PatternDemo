package com.dist.pattern.demo.strategy;

/**
 * ԭ��
 * @author weifj
 *
 */
public class OriginalStrategy implements PriceStrategy {

	@Override
	public void getPrice(Double price) {
		
		System.out.println("ԭ�ۣ�"+price);
		
	}

}
