 package com.cg.stat;

public class StatEmp {
	static {
		System.out.println("Welcome to Capgemini");
	}
	private static int idCounter =0;
	private String name;
	private double salary;
	private int id;
	private int age;
	
	public StatEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatEmp(int id, String name, double salary,int age) {
		
		this.name = name;
		this.salary = salary;
		this.age=age;
		this.id=getCounter();
	}
	
	@Override
	public String toString() {
		return "StatEmp [name=" + name + ", salary=" + salary + ", id=" + id + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCounter() {
			return ++idCounter;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}
	

}
