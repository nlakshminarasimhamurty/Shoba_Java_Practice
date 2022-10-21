package com.operators;

public class Airthmetical_Operator_1 {

	public static void main(String[] args) {
		Airthmetical_Operator_1 ar=new Airthmetical_Operator_1();
		System.out.println(ar.addition(10.0, 20.0));
		System.out.println(subtraction(20, 10)); //1st condition
		System.out.println(subtraction(10, 20)); //Condition 2 //-1
		System.out.println(multiplication(15, 25));
		System.out.println(division(0, 1));
		System.out.println(division(5, 0));
	}

	public double addition(double number1, double number2) {

		double sum = number1 + number2;

		return sum;
	}

	public static double subtraction(double number1, double number2) {
		double subtraction = -1.0;

		if (number1 >= number2) { // 10 20
			subtraction = number1 - number2;
		} else {
			System.out.println("number1 should greater number2");

		}
		return subtraction;
	}

	// introduce casting concept.

	public static short multiplication(int number1, int number2) {
		return (short) (number1 * number2);
	}

	public static int division(int number1, int number2) {

		int division = -1;
		if (number2 > 0) {
			division = number1 / number2;
		} else {
			System.out.println("cannot be divided by Zero");
		}

		return division;
	}

}
