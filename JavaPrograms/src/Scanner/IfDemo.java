package Scanner;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		
		int pwd;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Your Password :");
		
		pwd=sc.nextInt();
		
		 
		if(pwd ==4150)
		{
			System.out.println(" Your password Is Correct");
		}
		
	}
}
