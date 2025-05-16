package com.nit.Assignments;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	private String name;
	private int age;
	private String job;
	private int salary;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Employee(String name, int age, String job, int salary, String location) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", job=" + job + ", salary=" + salary + ", location="
				+ location + "]";
	}
	
}
public class MainClass{
	
	public static void displayIf(ArrayList<Employee> e,Predicate<Employee> p)
	{
		for(Employee emp:e)
		{
			if(p.test(emp))
			{
				System.out.println(emp);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<Employee>();
		Employee Sindhu=new Employee("Sindhu",22,"IT",30000,"Hyderabad");
		Employee UdayaSri=new Employee("Udayasri",22,"Govt",35000,"Khammam");
		Employee Vineetha=new Employee("Vineetha",23,"IT",25000,"Banglore");
		emps.add(Sindhu);
		emps.add(UdayaSri);
		emps.add(Vineetha);
		//displayIf(emps,(e)->e.getName().equalsIgnoreCase("Sindhu"));
		displayIf(emps,(e)->e.getAge()>22);
		displayIf(emps,(e)->e.getName().startsWith("S"));
		System.out.println("Employee based on salary>20000");
		displayIf(emps,(e)->e.getSalary()>20000);
		
	}
}
