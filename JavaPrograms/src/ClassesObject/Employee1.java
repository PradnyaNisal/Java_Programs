package ClassesObject;

import java.util.Scanner;

public class Employee1 {


		
        String name;
		int  empid,salary ;
		
		Scanner sc=new Scanner(System.in);
		
void getdata() {
			 System.out.println("Enter name :");
			 name = sc.next();
			 System.out.println("Enter id :");
			 empid = sc.nextInt();
			 System.out.println("Enter salary :");
			 salary= sc.nextInt();
			 
			
			 
		} 
void disp() {
	         System.out.println("this is your Output");
				System.out.println("Empoyee:"+name);
				System.out.println("Empid:"+empid);
				System.out.println("salary:"+salary);
			
	}

}
