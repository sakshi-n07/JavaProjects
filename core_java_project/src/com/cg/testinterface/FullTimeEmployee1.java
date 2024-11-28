package com.cg.testinterface;

public class FullTimeEmployee1 extends Employee1 implements PerformanceEvaluation {
	
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

	@Override
	public void evaluatePerformance() {
		// TODO Auto-generated method stub
		System.out.println(name+" salary is "+salary);
		}
	

}
