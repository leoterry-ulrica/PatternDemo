package com.dist.pattern.demo.singleinstance;

/**
 * 双重检测锁定
 * @author weifj
 *
 */
public class SettingsDbHelperDCL {

	private SettingsDbHelperDCL(){
		
	}
	//===========错误做法==========
/*	private static SettingsDbHelperDCL sInst = null; 
	public static SettingsDbHelperDCL getInstance() { 
	    if (sInst == null) {                              // 1
	        synchronized (SettingsDbHelperDCL.class) {       // 2
	        	SettingsDbHelperDCL inst = sInst;            // 3
	            if (inst == null) {                       // 4
	                inst = new SettingsDbHelperDCL(); // 5
	                sInst = inst;                         // 6
	            }
	        }
	    }
	    return sInst;                                     // 7
	}
*/
	
	//===========正确做法===========
	private static volatile SettingsDbHelperDCL sInst = null;  // <<< 这里添加了 volatile 
	public static SettingsDbHelperDCL getInstance() { 
		SettingsDbHelperDCL inst = sInst;  // <<< 在这里创建临时变量
	    if (inst == null) {                                                  // 1
	        synchronized (SettingsDbHelperDCL.class) {   // 2
	            inst = sInst;                                     // 3
	            if (inst == null) {                                  // 4
	                inst = new SettingsDbHelperDCL();           // 5
	                sInst = inst;                                      // 6
	            }
	        }
	    } 
	    return inst;  // <<< 注意这里返回的是临时变量         // 7
	}

	
}
