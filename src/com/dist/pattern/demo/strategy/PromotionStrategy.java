package com.dist.pattern.demo.strategy;

/**
 *  �����ۣ���Ʒ���ܹ��ڣ�
 * @author weifj
 *
 */
public class PromotionStrategy implements PriceStrategy {

	@Override
	public void getPrice(Double price) {
		
		System.out.println("�����ۣ�"+price*0.7);
		
	}

}
