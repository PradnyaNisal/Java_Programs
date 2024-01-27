package Scanner;
import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		int days;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choise");
		days=sc.nextInt();
		
		switch(days) 
		{
			case 1:
			System.out.println("Monday");
			break;
			
			case 2:
				System.out.println("tuseday");
				break;
			
			case 3:
				System.out.println("wednesday");
				break;
			
			case 4:
				System.out.println("thuesday");
				break;
			case 5:
				System.out.println("friday");
				break;
				
			case 6:
				System.out.println("satureday");
				break;
			case 7:
				System.out.println("Monday");
				break;
				
			default :
				
				System.out.println("You Enter wrong Choice Please Check and Try agin");	

		 }
	
		

	}

}
