package com.dist.pattern.demo.prototype;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws Exception {
		
		// 比较效率
		//compareEfficiency();
		
		// 说明浅拷贝和深拷贝
		copy();
	}

	/**
	 * 比较效率
	 * @throws Exception
	 */
	private static void compareEfficiency() throws Exception {
		// 说明克隆提供效率
		// 例如我需要克隆20个对象，分别使用构造函数和克隆技术进行运行
		// 构造函数
		long start = System.currentTimeMillis();
		for(int i=0; i<20; i++){
			new DollySheep(1, "多利", new Date());
		}
		long end = System.currentTimeMillis();
		System.out.println(String.format("构造函数总共消耗： %s 毫秒", end -start));
		
		// 克隆技术
		start = System.currentTimeMillis();
		DollySheep sheep = new DollySheep(1, "多利", new Date());
		for(int i=0; i<19; i++){
			DollySheep cloneSheep = (DollySheep) sheep.clone();
			cloneSheep.setAge(i);
			cloneSheep.setDate(new Date());
			cloneSheep.setName(i+"");
		}
		end = System.currentTimeMillis();
		System.out.println(String.format("克隆技术总共消耗： %s 毫秒", end -start));
	}
	
	/**
	 * 深浅拷贝
	 * @throws Exception 
	 */
	private static void copy() throws Exception {
		
		Date date = new Date();
		String name = "多利";
		DollySheep sheep = new DollySheep(1, name, date);
		System.out.println("克隆前："+sheep.toString());
		
		DollySheep cloneSheep = (DollySheep) sheep.clone();
		System.out.println("克隆后："+cloneSheep.toString());
		System.out.println(cloneSheep.getName() == sheep.getName()  ? "clone是浅拷贝的" : "clone是深拷贝的");  
		
		System.out.println("修改克隆前的羊的名字：多利兄弟");
		name = "多利兄弟";// String 类型虽然是引用类型，但比较特殊，它的内容是不可变的。
		System.out.println("修改后克隆羊的名字："+cloneSheep.getName());

		System.out.println("修改克隆前的羊的出生时间：");
		date.setTime(8585484L);
		
		System.out.println("克隆前的羊的出生时间："+sheep.getDate());
		System.out.println("克隆后的羊的出生时间："+cloneSheep.getDate());
	}
}
