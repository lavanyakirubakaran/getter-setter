package com.javaproject;

public class App {
	public static void main(String lava[]) {
		User user=new User();
		user.setName("gv");
		System.out.println(user.getName());
		user.setid(32);
		System.out.println(user.getid());
		user.setcollagename("Dhanalakeshmi srinivasan collage of enginerring");
		System.out.println(user.getcollagename());
		user.setdept("CSE-deptment");
		System.out.println(user.getdept());
	}

}
