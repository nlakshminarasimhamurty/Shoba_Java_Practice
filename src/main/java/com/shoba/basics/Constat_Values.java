package com.shoba.basics;

/**
 * 
 * if the variable is final then we cannot re initialize the values
 * 
 * if the method is final then we cannot perform method overriding.
 * 
 * if the class is final then we cannot perform inheritance.
 */
final public class Constat_Values {

	static final double PIVALUE;
	final double PIVAL = 3.147;

	static {
		PIVALUE = 3.147;
		// piValue=4.18; we cannot update the value.
	}

	{
		// PIVAL=4.187; we cannot update the value.
	}

	public static void main(String[] args) {

	}

}
