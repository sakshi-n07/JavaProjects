package com.cg.collection.comparable;

import java.util.Objects;

public class Empp implements Comparable<Empp> {
	static {
		System.out.println("Welcome to capgemini");
	}
 
	private int id;
	String name;
	double salary;
 
	public Empp(int i, String r, int s) {

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

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empp other = (Empp) obj;
		return id == other.id && Objects.equals(name, other.name)
&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	public void display()
	{
		System.out.println("id is: "+id +"-NAME"+ name+"salary is"+salary);
	}*/
	@Override
	public int compareTo(Empp e) {
		if (e.salary==this.salary)
			return 0;
		else if ( e.salary>this.salary)
			return -1;
		else 
			return 1;
		//return this.name.compareTo(e.name);
	}
	
	}
 