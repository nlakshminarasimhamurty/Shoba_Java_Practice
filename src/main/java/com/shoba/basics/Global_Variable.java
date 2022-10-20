package com.shoba.basics;

public class Global_Variable {

	static int i=30; // static variable

	int j = 30; // non static variable

	public static void main(String[] args) {
		System.out.println(i);

		Global_Variable gb1 = new Global_Variable();
		System.out.println(gb1.j);
	}

}
