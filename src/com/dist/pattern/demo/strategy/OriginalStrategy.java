package com.dist.pattern.demo.strategy;

/**
 * 原价
 * @author weifj
 *
 */
public class OriginalStrategy implements PriceStrategy {

	@Override
	public void getPrice(Double price) {
		
		System.out.println("原价："+price);
		
	}

}
