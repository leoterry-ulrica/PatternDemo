package com.dist.pattern.demo.singleinstance;

/**
 * ���г�ʼ��
 * @author weifj
 *
 */
public class SettingsDbHelperIns {

	private static SettingsDbHelperIns sInst = new SettingsDbHelperIns();

	private SettingsDbHelperIns() {
		
	}
	public static SettingsDbHelperIns getInstance() {
		return sInst;
	}

}
