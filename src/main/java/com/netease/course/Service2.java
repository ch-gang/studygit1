package com.netease.course;

public class Service2 {

	public void save(String s) {
		try {
			System.out.println(s+"插入成功");
		} catch (Exception e) {
				
		}
	}

	public void delete(String s) {
		try {
			System.out.println(s+"删除成功");
		} catch (Exception e) {
		
		}
	}
	
	public void update(String s) {
		try {
			System.out.println(s+"更新成功");
		} catch (Exception e) {

		}
	}
	
	public String get(String s) {
		try {
			System.out.println(s+"获取成功");
		} catch (Exception e) {
	
		}
		return s;
	}
	
}
