package Exception12;

import java.util.Scanner;

public class Excepeption {

	
	public static void main(String args[])
	{
		int a=0,b=0,res;
		try {
		Scanner sc= new Scanner(System.in);
		
		//entering first no
		 System.out.println("Enter first number:");
			 a = sc.nextInt();
			
			 //entering second no12
			 
		 System.out.println("Enter second number:");
		 		 b=sc.nextInt();
		 	 //process
		   res=a/b;
		 
		System.out.println("Division is="+res);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Denominator should not be Zero!!please enter number1-9");
		}

	res=a+b;
	System.out.println("Addition is "+res);

}
}
//parsInt using only cmd
