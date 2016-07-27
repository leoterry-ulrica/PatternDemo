package com.dist.pattern.demo.singleinstance;

/**
 * ˫�ؼ������
 * @author weifj
 *
 */
public class SettingsDbHelperDCL {

	private SettingsDbHelperDCL(){
		
	}
	//===========��������==========
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
	
	//===========��ȷ����===========
	private static volatile SettingsDbHelperDCL sInst = null;  // <<< ��������� volatile 
	public static SettingsDbHelperDCL getInstance() { 
		SettingsDbHelperDCL inst = sInst;  // <<< �����ﴴ����ʱ����
	    if (inst == null) {                                                  // 1
	        synchronized (SettingsDbHelperDCL.class) {   // 2
	            inst = sInst;                                     // 3
	            if (inst == null) {                                  // 4
	                inst = new SettingsDbHelperDCL();           // 5
	                sInst = inst;                                      // 6
	            }
	        }
	    } 
	    return inst;  // <<< ע�����ﷵ�ص�����ʱ����         // 7
	}

	
}
