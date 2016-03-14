package com.test;

import com.test.oops.manager.HRManager;
import com.test.oops.programmer.JAVAProgrammer;
import com.test.teststatic.MyMath;

public class OOPsApplication {

	public OOPsApplication() {
		
	}

	public static void main(String[] args) {

		HRManager hrManager = new HRManager();

		JAVAProgrammer programmer = new JAVAProgrammer();
		programmer.setName("John");

		hrManager.addTeamMember(programmer);

		hrManager.printDetails();

		hrManager.giveReport();
		
		//
		// Employee e = new JAVAProgrammer();
		//
		// Employee e2 = new HRManager();

	}

}
