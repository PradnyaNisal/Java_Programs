package ClassesObject;

import java.util.Scanner;

public class Student1 {
 
		
		String name;
		int rno,marks;
		Scanner sc=new Scanner(System.in);

		void getdata() {
			 System.out.println("Enter rno,name, marks :");
			 
			 rno = sc.nextInt();
			 name =sc.next();
			 marks =sc.nextInt();
		 } 
		 
		 
 void dispy() {
	System.out.println("roll no: "+rno);
	System.out.println("Name: "+ name);
	System.out.println("Marks: "+marks);
	
	
}

	}