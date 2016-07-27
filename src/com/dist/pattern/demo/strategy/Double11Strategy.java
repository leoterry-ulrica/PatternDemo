package com.dist.pattern.demo.strategy;

/**
 * 双十一
 * @author weifj
 *
 */
public class Double11Strategy implements PriceStrategy {

	@Override
	public void getPrice(Double price) {
		
		System.out.println("双十一价格："+price*0.85);
		
	}

}
