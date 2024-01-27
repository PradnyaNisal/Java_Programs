package Scanner;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Nubmer:");
		
		a=sc.nextInt();
	
		if(a %2 ==0)
		{
			System.out.println(a+ " number is even ");
			
		}
		else
			System.out.println(a+ " number is odd");
		
		sc.close();
	}
	
	}


