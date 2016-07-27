package com.dist.pattern.demo.singleinstance;

/**
 * �ڲ���
 * 
 * @author weifj
 *
 */
public class SettingsDbHelperInner {

	private SettingsDbHelperInner() {
		if (SettingsDbHelperInnerLoader.INSTANCE != null) {
			throw new IllegalStateException("Already instantiated");
		}
	}
	// �ڲ���
	private static class SettingsDbHelperInnerLoader {
		private static final SettingsDbHelperInner INSTANCE = new SettingsDbHelperInner();
	}

	public static SettingsDbHelperInner getInstance() {
		return SettingsDbHelperInnerLoader.INSTANCE;
	}
}
