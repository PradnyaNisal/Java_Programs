package Scanner;

import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		
		age=sc.nextInt();
		
		if(age>18) {
			System.out.println("Your are Eligible For Voting");
		}
		else
		{
			System.out.println("Your are not Eligible For Voting");	
		}
		sc.close();
	}

}
