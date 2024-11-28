package com.cg.abstrct;

public class PartTimeEmployee extends Employee{
	private double hourlyrate;
	double hoursworked;

	public PartTimeEmployee(int id, String name, double hourlyrate, double hoursworked) {
		super(id, name);
		this.hourlyrate = hourlyrate;
		this.hoursworked = hoursworked;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Hourly Rate:"+hourlyrate);
		System.out.println("Hours worked:"+hoursworked);
	}

	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		return hourlyrate*hoursworked;
	}

	

	

	
	
}
