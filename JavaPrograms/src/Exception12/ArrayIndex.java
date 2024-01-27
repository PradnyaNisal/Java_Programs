package Exception12;

public class ArrayIndex {
	public static void main(String agrs[]) {
		
		
	String arr[]=new String[5];
	try {
		System.out.println(arr[5]);
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("out of bound");
}
}
	
	
	
}
