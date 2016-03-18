package com.test.teststatic;

public class MyMath {

	/**
	 * Global variable
	 */
	static int count;

	/**
	 * Constant
	 */
	public static final double PI = 3.1428;

	/**
	 * Static block - executes even before constructor but only once and before first object
	 */
	static {

		System.out.println("static block");

	}
	
	{
		
	}

	/**
	 * Default Constructor
	 */
	public MyMath() {

		count++;

	}

	// -------------------------------------------------------
	// Method Overloading with instance method
	// -------------------------------------------------------
	/**
	 * Instance Method
	 */
	public void test() {

		/**
		 * local variable
		 */
		int i;

		i = count++;

		System.out.println("print i= " + i);
	}

	/**
	 * Instance Method
	 */
	public void test(int i) {

		i = count++;

		System.out.println("print i= " + i);
	}

	// -------------------------------------------------------
	// Method Overloading with static method
	// -------------------------------------------------------

	
	public int add(int a, int b ,int c, int d) {

		return a + b;
	}
	
	public static int add(int a, int b) {

		return a + b;
	}

	public static int add(int a, int b, int c) {

		return a + b + c;
	}

	public static float add(float a, float b) {

		return a + b;
	}

	public static double add(double a, double b) {

		return a + b;
	}

}
