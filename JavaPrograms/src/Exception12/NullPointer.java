package Exception12;

public class NullPointer {

	public static void main(String[] args) {
		String Name= null;
		try 
		{
			System.out.println(""+Name);
		}
catch(NullPointerException n) 
		{
	
	System.out.println("end");
}
	}

}
