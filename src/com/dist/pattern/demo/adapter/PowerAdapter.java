package com.dist.pattern.demo.adapter;

public class PowerAdapter implements PowerThree {

	private PowerTow powerTwo;
	
	public PowerAdapter(PowerTow powerTwo) {
		
		this.powerTwo = powerTwo;
	}
	@Override
	public void processWithThree() {
		// TODO Auto-generated method stub
		this.powerTwo.processWithTwo();
	}

}
