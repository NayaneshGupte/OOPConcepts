package com.test.oops;

/**
 * Abstract class - Contains abstract as well as non-abstract methods
 * 
 * @author nayanesh
 *
 */
public abstract class Employee {

	/** name of the employee */
	protected String name;

	protected String designation;

	protected double salary;

	protected final long empID =1000;

	public Employee() {

	}

	// -------------------------------------------------------
	// Encapsulation - Getters-setters
	// -------------------------------------------------------

	protected abstract double getSalary();

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
