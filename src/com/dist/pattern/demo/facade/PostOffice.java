package com.dist.pattern.demo.facade;

/**
 * �ʾ�
 * @author weifj
 *
 */
public class PostOffice {

	private LetterProcess letter = new ConcreteLetterProcess();
	
	public void sendLetter(String context, String address) {
		
		letter.writeContext("context");
		letter.fillEnvelope("address");
		letter.letterInotoEnvelope();
		letter.sendLetter();
		
	}
}
