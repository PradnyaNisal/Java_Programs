package Inheritance;

import java.util.Scanner;

interface gross  {
	 int ta=3000, da=2000;
	 void gorss_sal();
 }
	 
 abstract class Employee{
		
		 int basic;
		 String name;
		
		 Scanner sc =  new Scanner(System.in);
		
		abstract void basic_sal();{
			 System.out.println("Enter name of employee");
			 name=sc.next();
			 System.out.println("Enter basic salary of Employee");
			 basic= sc.nextInt();
		 }
 }
 class salary extends Employee implements gross{
	 	
	 		int gross;
	 		
	 		public void gross_sal() {
	 			gross =basic +ta+da;
	}
	 		void disp_sal()
	 		{
	 			System.out.println("Name: "+name+"\tGross: "+gross);
	 			
	 		}
			@Override
			public void gorss_sal() {
				// TODO Auto-generated method stub
				
			}
			@Override
			void basic_sal() {
				// TODO Auto-generated method stub
				
			}
			
 }
 class Multiple2{
	 public static void main(String args[]) {
		 salary s=new salary();
		 s.basic_sal();
		 s.gross_sal();
		 s.disp_sal();
		 
		 
	 }
 }