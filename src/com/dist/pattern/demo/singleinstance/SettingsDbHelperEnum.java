package com.dist.pattern.demo.singleinstance;

/**
 * 枚举产生单例
 * 
 * @author weifj
 *
 */
public enum SettingsDbHelperEnum {

	INSTANCE;

	public void print() {
		System.out.println("枚举产生单例。");
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		SettingsDbHelperEnum.INSTANCE.print();
		long end = System.currentTimeMillis();
		System.out.println((end - start) + " 毫秒");
	}

}
