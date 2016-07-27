package com.dist.pattern.demo.singleinstance;

/**
 * ∆»«–≥ı ºªØ
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
