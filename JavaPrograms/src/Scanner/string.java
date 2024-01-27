package Scanner;

import java.util.Scanner;

public class string {
	public static void main(String []args)
	{
		String Name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		
		Name=sc.next();
		
		System.out.println("hello "+ Name);
		sc.close();
	}

	
}
