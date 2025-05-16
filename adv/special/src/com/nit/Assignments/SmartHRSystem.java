package com.nit.Assignments;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee11
{
	String name;
	double salary;
	int rating;
	
	public Employee11(String name,double salary,int rating) {
		super();
		this.name = name;
		this.salary=salary;
		this.rating = rating;
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

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public  int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Employee11 [name=" + name + ", salary=" + salary + ", rating=" + rating + "]";
	}
	
}
public class SmartHRSystem {

	public static void main(String[] args) {
		ArrayList<Employee11> emp11=new ArrayList<Employee11>();
		Employee11 sindhu=new Employee11("Sindhu",40000,6);
		Employee11 vineetha=new Employee11("Vineetha",30000,7);
		Employee11 Lavanya=new Employee11("Lavanya",35000,3);
		emp11.add(sindhu);
		emp11.add(vineetha);
		emp11.add(Lavanya);
		
		Predicate<Employee11> eligible = emp -> emp.getRating() >= 4;
		
		Function<Employee11,Double> bonuses=emp->emp.getSalary()*0.10;
		
		Consumer<Employee11> notify = emp -> {
	           double bonus = bonuses.apply(emp);
	           System.out.printf("Notification Sent: %s, congratulations! You’ve received a bonus of ₹%.1f%n", emp.getName(), bonus);
	        };

	        // Process each employee
	        emp11.forEach(emp -> {
	            if (eligible.test(emp)) {
	                notify.accept(emp);
	            } else {
	                System.out.println(emp.getName() + " is not eligible for a bonus.");
	            }
	        });
		
		System.out.println("HR SYSTEM: Bonus processing completed!");
	}


}
