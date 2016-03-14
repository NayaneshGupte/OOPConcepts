package com.test.collections;

public class EqualsHashcodeExample {

	public EqualsHashcodeExample() {
		
	}

	
	public static void main(String[] args) {
		
		testEquals();
	}
	
	private static void testEquals(){
		
		Student s1 = new Student();
		s1.setName("Raj");
		s1.setStandard("10TH");

		Student s2 = new Student();
		s2.setName("Raj");
		s2.setStandard("10TH");

		if (s1.equals(s2)) {

			System.out.println("Equal");

		} else {

			System.out.println("Not Equal");

		}

	}
}
