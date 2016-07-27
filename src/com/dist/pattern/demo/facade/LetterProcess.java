package com.dist.pattern.demo.facade;

public interface LetterProcess {

	/**
	 * д��
	 * @param context
	 */
	void writeContext(String context);
	/**
	 * д�ŷ�
	 * @param address
	 */
	void fillEnvelope(String address);
	/**
	 * װ����
	 */
	void letterInotoEnvelope();
	/**
	 * Ͷ��
	 */
	void sendLetter();
}
