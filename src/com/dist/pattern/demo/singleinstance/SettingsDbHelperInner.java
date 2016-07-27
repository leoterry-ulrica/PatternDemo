package com.dist.pattern.demo.singleinstance;

/**
 * 内部类
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
	// 内部类
	private static class SettingsDbHelperInnerLoader {
		private static final SettingsDbHelperInner INSTANCE = new SettingsDbHelperInner();
	}

	public static SettingsDbHelperInner getInstance() {
		return SettingsDbHelperInnerLoader.INSTANCE;
	}
}
