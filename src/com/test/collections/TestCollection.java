package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class TestCollection {

	public TestCollection() {

	}

	public static void main(String[] args) {

		iterateArrayListExample();

		testHashset();

	}

	private static void iterateArrayListExample() {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		for (String obj : al) {
			System.out.println(obj);
		}
	}

	private static void testHashset() {

		Student s1 = new Student();
		s1.setName("Raj");
		s1.setStandard("10TH");

		Student s2 = new Student();
		s2.setName("Raj");
		s2.setStandard("10TH");

		HashSet<Student> h = new HashSet<Student>();

		if (h.add(s1)) {

			System.out.println("s1 added");

		} else {

			System.out.println("s1 Not added");
		}

		if (h.add(s2)) {

			System.out.println("s2 added");

		} else {

			System.out.println("s2 Not added");
		}
	}

}
