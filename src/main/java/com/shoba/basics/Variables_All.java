package com.shoba.basics;

public class Variables_All {

	static String name = "sowbhagya";
	static {
		name = "gun";
	}

	String name1 = "naveen";

	{
		name1 = "non-static block";
	}

	public static void main(String[] args) {

		String name = "pavana"; //
		name = "Gundlahalli";
		System.out.println(Variables_All.name);

		Variables_All vall = new Variables_All();
		System.out.println(vall.name1);

		Variables_All.name = "update";

		System.out.println(Variables_All.name);
		vall.name1="updated value using refrence variable";
		System.out.println(vall.name1);

	}

}
