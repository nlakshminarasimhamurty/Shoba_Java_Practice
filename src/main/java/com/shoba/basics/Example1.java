package com.shoba.basics;

public class Example1 {

	public static void main(String[] args) {
		// printCharecter("Pavagada naveen");
		replaceToString("naveen@!!!");

	}

	public static void printCharecter(String name) {

		for (int i = 0; i < name.length(); i++) {

			System.out.println(name.charAt(i));
		}
	}

	public static void replaceToString(String text) {

		char[] charArray = text.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if ((int) charArray[i] >= 65 && (int) charArray[i] >= 128) {

			} else {
				System.out.println(charArray[i]);
			}
		}

	}

}
