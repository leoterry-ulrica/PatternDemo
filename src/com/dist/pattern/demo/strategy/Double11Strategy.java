package com.dist.pattern.demo.strategy;

/**
 * ˫ʮһ
 * @author weifj
 *
 */
public class Double11Strategy implements PriceStrategy {

	@Override
	public void getPrice(Double price) {
		
		System.out.println("˫ʮһ�۸�"+price*0.85);
		
	}

}
