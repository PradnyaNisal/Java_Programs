package ClassesObject;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	Scanner sc =new Scanner(System.in);
	
	public void  getSalary() {
		
		System.out.println("Enter Emp Id");
		empid =sc.nextInt();
		
		System.out.println("Enter employee Name");
		name= sc.next();
		
		System.out.println("Enter Salary");
		salary = sc.nextDouble();	
	}
	
	public void display() {
		
		
		System.out.println("your Emp Id is "+ empid);
		System.out.println("your Name is " +name);                                    
		System.out.println("Yor salary is "+ salary);
	
	}

}
