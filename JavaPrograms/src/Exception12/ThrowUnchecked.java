package Exception12;

public class ThrowUnchecked { 
		
		public static void validate(int age) 
		
		{
			if(age <18) 
			{
				throw new ArithmeticException("not eligible");
			}
			
			else
			{
				System.out.println("You are eligible");
		    }
	}
		public static void main(String[] args) {
			
			
			ThrowUnchecked.validate(20);
			System.out.println("code ended....");
	
		}

}
