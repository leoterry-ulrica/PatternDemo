package com.dist.pattern.demo.adapter;

public class Client {

	public static void main(String[] args) {
		
		PowerThree powerThree = new ConcretePowerThree();
		System.out.println("原来办公室只有三角插座.......");
		Office office = new Office(powerThree);
		office.charge();
		
		System.out.println("添加插座适配器后，可以支持两脚插座充电.......");
		PowerTow powTwo = new ConcretePowerTwo();
		PowerAdapter pa = new PowerAdapter(powTwo);
		office = new Office(pa);
		office.charge();
	}
}
