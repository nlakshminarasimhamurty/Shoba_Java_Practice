package com.shoba.basics;

public class Local_Variables {

	static {
		int i = 10;
		System.out.println(i);
		// int i =30;

	}
	{
		int i = 60;
		System.out.println(i);
		// int i =30;

	}

	public static void main(String[] args) {
		int i;
		i=40;
		System.out.println(i);

		demo1();
		Local_Variables lc= new Local_Variables();
		lc.demo2();
		
		Local_Variables lc1= new Local_Variables();

	}

	public static void demo1() {

		int i = 40;
		System.out.println(i);
	}

	public void demo2() {

		int i = 50;
		System.out.println(i);
	}

}
