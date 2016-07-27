package com.dist.pattern.demo.facade;

public interface LetterProcess {

	/**
	 * 写信
	 * @param context
	 */
	void writeContext(String context);
	/**
	 * 写信封
	 * @param address
	 */
	void fillEnvelope(String address);
	/**
	 * 装好信
	 */
	void letterInotoEnvelope();
	/**
	 * 投递
	 */
	void sendLetter();
}
