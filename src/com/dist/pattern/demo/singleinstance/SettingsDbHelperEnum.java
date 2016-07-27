package com.dist.pattern.demo.singleinstance;

/**
 * ö�ٲ�������
 * 
 * @author weifj
 *
 */
public enum SettingsDbHelperEnum {

	INSTANCE;

	public void print() {
		System.out.println("ö�ٲ���������");
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		SettingsDbHelperEnum.INSTANCE.print();
		long end = System.currentTimeMillis();
		System.out.println((end - start) + " ����");
	}

}
