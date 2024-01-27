package math;

public class Nestedif {
	public static void main(String []args)
	{
		int a= 20;
		int b= 50;
		int c= 30;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greaterthan");
				
			}
			else
			{
				System.out.println(c+ " c is greaterthan");
				
			}
		}
		else 
		{
			if(b>c)
			{
				System.out.println(b+" b is graterthan");
				
			}
			else
			{
				System.out.println("c is greaterthan");
			}
		}
	}


}
