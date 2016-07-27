package com.dist.pattern.demo.strategy;

/**
 *  促销价（商品可能过期）
 * @author weifj
 *
 */
public class PromotionStrategy implements PriceStrategy {

	@Override
	public void getPrice(Double price) {
		
		System.out.println("促销价："+price*0.7);
		
	}

}
