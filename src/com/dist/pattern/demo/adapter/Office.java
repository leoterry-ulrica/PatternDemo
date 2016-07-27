package com.dist.pattern.demo.adapter;

public class Office {

	private PowerThree powerThree;
	
	public Office(PowerThree powerThree) {
		
		this.powerThree = powerThree;
	}
	
	public void charge() {
		
		this.powerThree.processWithThree();
	}
}
