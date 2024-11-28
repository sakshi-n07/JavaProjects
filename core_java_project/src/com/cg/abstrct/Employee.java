package com.cg.abstrct;

public abstract class Employee {
	protected int id;
	protected String name;
	public Object salary;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public abstract double CalculateSalary() ;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
	}
}
