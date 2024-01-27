package ClassesObject;

import java.util.Scanner;

public class Student {
 
		String name;
		int rno,marks;
		Scanner sc =new Scanner(System.in);
		
	 public void  getMarks() {
		
		System.out.println("Enter Your Name:");
		name=sc.next();
		
		System.out.println("Enter yor RollNo:");
		rno=sc.nextInt();
		
		System.out.println("Enter Your Marks");
		marks=sc.nextInt();

		
	}

		public void display()
		{
			System.out.println("your Name is "+ name);
			System.out.println("your rollNo is " +rno);
			System.out.println("Yor Marks is "+ marks);
		}
		
	}
