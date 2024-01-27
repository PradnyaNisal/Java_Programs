package Scanner;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		
	float Eng, Math, Sci,Hindi,Marathi,Total,Per;
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Enter Marks In English :");
	Eng =sc.nextFloat();
	
	System.out.println(" Enter Marks In Math :");
	Math =sc.nextFloat();
	
	
		System.out.println("Enter Marks in Sci");
		 Sci=sc.nextFloat();

   
	System.out.println("Enter Marks in Hindi");
	Hindi=sc.nextFloat();
	
	
	System.out.println("Enter Marks In Marathi");
	Marathi=sc.nextFloat();
	
	/*Total=sc.nextFloat();
	System.out.println("Total marks in subject");
	
	Per=sc.nextFloat();
	System.out.println(" Total Percentage");
	*/
	Total=Eng+Math+Sci+Hindi+Marathi;
	
	Per=Total/5;
	System.out.println("Total Marks ="+Total);
	
	System.out.println("Total Persentage ="+Per);

	if(Per>75)
	{
		System.out.println("Result Distiction");
	
	}
	else if(Per>65)
	{
		
		System.out.println("Result First Class");
		
	}
	else if(Per>60)
	{
		System.out.println("Result second class ");
	}

	
	else if(Per>50)
	{
		System.out.println("Result 3rd Class");
	}
	

	else if(Per>35)
	{
		System.out.println("Result Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	}
	
}
	
	

