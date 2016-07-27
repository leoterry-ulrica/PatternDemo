package com.dist.pattern.demo.prototype;

import java.util.Date;

/**
 * 克隆多利羊
 * 
 * @author weifj
 *
 */
public class DollySheep implements Cloneable {

	private Integer age;
	private String name;
	private Date date;

	public DollySheep(Integer age, String name, Date date) throws Exception {

		this.age = age;
		this.name = name;
		this.date = date;
		// 原来本身需要经历一系列复杂繁殖过程
		// 例如休眠2秒
		Thread.sleep(2000);

	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 为了演示方便，不捕获异常
	 */
	@Override
	public Object clone() {

		DollySheep newSheep = null;
		try {
			newSheep = (DollySheep) super.clone();
			//newSheep.setName(new String(this.name));
			
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}

		return newSheep;
	}

	@Override
	public String toString() {
		
		return String.format("age : %s, name : %s, date : %s", this.age, this.name, this.date);
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}
}
