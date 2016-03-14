package com.test;

import com.test.collections.Student;

public class FirstClass {

	private int count;

	public long number;

	boolean isCorrect;

	float small = 3.14f;

	double big = 123456789.345;

	String description = " Hi, this is my first class";

	final double pi = 3.1428;

	public FirstClass() {

	}

	private void drive() {

	}

	void print(String content) {

	}

	int add(int a, int b) {

		return a + b;
	}

	public static void main(String[] args) {

		System.out.println("Main Method");

		FirstClass firstClass = new FirstClass();

		Student s1 = new Student();

		Student s2 = new Student();

	}

}
