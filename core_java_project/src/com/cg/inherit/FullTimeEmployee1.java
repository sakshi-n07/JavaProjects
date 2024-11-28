package com.cg.inherit;

public class FullTimeEmployee1 extends Employee1 {
	
	double salary;

	public FullTimeEmployee1(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Salary:"+salary);
	}
	

}
