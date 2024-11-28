package com.cg.abstrct;

public class FullTimeEmployee extends Employee {
	double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Salary:"+salary);
	}

	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	

}
