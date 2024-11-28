package com.cg.inherit;

public class Employee1 {
	protected int id;
	protected String name;
	
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}

	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
	}
}
