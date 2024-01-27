package Exception12;

public class NumberNotFound {

	public static void main(String[] args) {
		String str= "Pradnya";
		
		
		try
		{
			int a =Integer.parseInt(str);
			System.out.println(""+a);
		}
		catch(NumberFormatException n)
		{
			System.out.println("not found");
		}
		
		

	}

}
