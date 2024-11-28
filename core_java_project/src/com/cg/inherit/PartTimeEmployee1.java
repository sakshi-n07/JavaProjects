package com.cg.inherit;

public class PartTimeEmployee1 extends Employee1{
	private double hourlyrate;

	public PartTimeEmployee1(int id, String name, double hourlyrate) {
		super(id, name);
		this.hourlyrate = hourlyrate;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Hourly Rate:"+hourlyrate);
	}

	

	

	
	
}
