package com.dist.pattern.demo.prototype;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws Exception {
		
		// �Ƚ�Ч��
		//compareEfficiency();
		
		// ˵��ǳ���������
		copy();
	}

	/**
	 * �Ƚ�Ч��
	 * @throws Exception
	 */
	private static void compareEfficiency() throws Exception {
		// ˵����¡�ṩЧ��
		// ��������Ҫ��¡20�����󣬷ֱ�ʹ�ù��캯���Ϳ�¡������������
		// ���캯��
		long start = System.currentTimeMillis();
		for(int i=0; i<20; i++){
			new DollySheep(1, "����", new Date());
		}
		long end = System.currentTimeMillis();
		System.out.println(String.format("���캯���ܹ����ģ� %s ����", end -start));
		
		// ��¡����
		start = System.currentTimeMillis();
		DollySheep sheep = new DollySheep(1, "����", new Date());
		for(int i=0; i<19; i++){
			DollySheep cloneSheep = (DollySheep) sheep.clone();
			cloneSheep.setAge(i);
			cloneSheep.setDate(new Date());
			cloneSheep.setName(i+"");
		}
		end = System.currentTimeMillis();
		System.out.println(String.format("��¡�����ܹ����ģ� %s ����", end -start));
	}
	
	/**
	 * ��ǳ����
	 * @throws Exception 
	 */
	private static void copy() throws Exception {
		
		Date date = new Date();
		String name = "����";
		DollySheep sheep = new DollySheep(1, name, date);
		System.out.println("��¡ǰ��"+sheep.toString());
		
		DollySheep cloneSheep = (DollySheep) sheep.clone();
		System.out.println("��¡��"+cloneSheep.toString());
		System.out.println(cloneSheep.getName() == sheep.getName()  ? "clone��ǳ������" : "clone�������");  
		
		System.out.println("�޸Ŀ�¡ǰ��������֣������ֵ�");
		name = "�����ֵ�";// String ������Ȼ���������ͣ����Ƚ����⣬���������ǲ��ɱ�ġ�
		System.out.println("�޸ĺ��¡������֣�"+cloneSheep.getName());

		System.out.println("�޸Ŀ�¡ǰ����ĳ���ʱ�䣺");
		date.setTime(8585484L);
		
		System.out.println("��¡ǰ����ĳ���ʱ�䣺"+sheep.getDate());
		System.out.println("��¡�����ĳ���ʱ�䣺"+cloneSheep.getDate());
	}
}
