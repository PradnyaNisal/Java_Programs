package Scanner;

import java.util.Scanner;

public class Greaternumber {

	public static void main(String[] args) {
		int a,b;
		Scanner sc =  new Scanner(System.in);	
		System.out.println("Enter Fist Nubmer:");

		a= sc.nextInt();
		System.out.println("Enter Sencond Number:");
	
		b= sc.nextInt();
	
		if(a>b)
		{
		System.out.println(a+" is grater");
		
		}
		else
		{
			System.out.println(b+"is grater");
		}
		sc.close();
	}

}
