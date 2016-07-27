package com.dist.pattern.demo.facade;

public class Client {

	public static void main(String[] args) {
		
		/*LetterProcess letter = new ConcreteLetterProcess();
		letter.writeContext("context");
		letter.fillEnvelope("address");
		letter.letterInotoEnvelope();
		letter.sendLetter();*/
		
		PostOffice po = new PostOffice();
		po.sendLetter("context", "address");
		
	}
}
