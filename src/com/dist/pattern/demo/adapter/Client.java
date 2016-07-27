package com.dist.pattern.demo.adapter;

public class Client {

	public static void main(String[] args) {
		
		PowerThree powerThree = new ConcretePowerThree();
		System.out.println("ԭ���칫��ֻ�����ǲ���.......");
		Office office = new Office(powerThree);
		office.charge();
		
		System.out.println("��Ӳ����������󣬿���֧�����Ų������.......");
		PowerTow powTwo = new ConcretePowerTwo();
		PowerAdapter pa = new PowerAdapter(powTwo);
		office = new Office(pa);
		office.charge();
	}
}
