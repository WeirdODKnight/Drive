package EmployeePackage;

import CustomerPackage.Customer;

public class Employee{

	

	
    private  int age;
    private int salary;
	
	
	private Employee(int age, int salary){
		this.age = age;
		this.salary = salary;
	}
	
	
	Employee(int salary){
		this.salary = salary;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee emp1 = new Employee(22,222);
		
		System.out.println(emp1.age);
	
		Employee emp = new Employee(222);
	

		
		

	}

}
