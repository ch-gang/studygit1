package com.netease.course;

public class Service2 {

	public void save(String s) {
		try {
			System.out.println(s+"����ɹ�");
		} catch (Exception e) {
				
		}
	}

	public void delete(String s) {
		try {
			System.out.println(s+"ɾ���ɹ�");
		} catch (Exception e) {
		
		}
	}
	
	public void update(String s) {
		try {
			System.out.println(s+"���³ɹ�");
		} catch (Exception e) {

		}
	}
	
	public String get(String s) {
		try {
			System.out.println(s+"��ȡ�ɹ�");
		} catch (Exception e) {
	
		}
		return s;
	}
	
}
