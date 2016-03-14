package com.test.oops;

public abstract class Manager extends Employee {

	protected int teamSize;

	public Manager() {

	}

	protected abstract void addTeamMember(Employee e);

	public void giveReport() {

	}

}
