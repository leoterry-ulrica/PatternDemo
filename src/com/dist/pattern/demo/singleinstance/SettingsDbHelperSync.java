package com.dist.pattern.demo.singleinstance;
/**
 * 同步方式
 * @author weifj
 *
 */
public class SettingsDbHelperSync {

	private static SettingsDbHelperSync sInst = null;
	private SettingsDbHelperSync() {
		// TODO Auto-generated constructor stub
	}
	public static synchronized SettingsDbHelperSync getInstance() {
		if (sInst == null) {
			sInst = new SettingsDbHelperSync();
		}
		return sInst;
	}
}
