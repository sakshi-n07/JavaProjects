package com.cg.comparator;

public class Empp  {
	static {
		System.out.println("Welcome to capgemini");
	}
 
 
	private int id;
	public String name;
	double salary;
 
	
	public Empp(int i, String r, int s) {
//		super();
		this.id=i;
		this.name=r;
		this.salary=s;
	}
	

 
	public int getId() {
		return id;
	}
 
 
	public void setId(int id) {
		this.id = id;
	}
 
 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
 
 
	
	}
 