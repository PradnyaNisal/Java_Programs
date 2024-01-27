package Scanner;

import java.util.Scanner;

public class Threenumber {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Fist Nubmer:");
		
		a=sc.nextInt();
		System.out.println("Enter Sencond Number:");
	
		
		b=sc.nextInt();
		
		System.out.println("Enter third Number:");
		c=sc.nextInt();
		
		
		if(a>b)
		{ 
			if(a>c)
			{
				System.out.println(a+"a is greater");
				
			}
			else
			{
				System.out.println(c+ " c is greater");
				
			}
		}
		else 
		{
			if(b>c)
			{
				System.out.println(b+" b is grater");
				
			}
			else
			{
				System.out.println(c+" c is greater");
			}
		}
		sc.close();
	}


}
