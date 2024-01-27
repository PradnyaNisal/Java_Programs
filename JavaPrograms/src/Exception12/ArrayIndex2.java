package Exception12;
import java.util.Scanner;

public class ArrayIndex2 {

	public static void main(String[] args) 
	{
		int a=0,b=0,res;
		
		try {
			Scanner sc=new  Scanner(System.in);
			
			System.out.println("Enter Value of a");
			a=sc.nextInt();
			
			System.out.println("Enter value of b:"); 
			
			 b=sc.nextInt();
			 
	 		 res=a/b;
	 		 
	 		System.out.println("Division is="+res);
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("can not divide by zero");
		}
		
		
		 catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("Insufficient arguments");
		}
		
		
		finally 
		{
			res=a+b;
			System.out.println("addition is"+res);
		}

	}

}
