package Poly;

 class Sub{
	 int a;
	 float b;
	 public int Sub(int a,int b) {
		 return a-b;
	 }
	 public float Sub(float c,float d) {
		 return c-d;
	 }
}
class Substraction{
	public static void main(String args[]) {
		Sub s1=new Sub();
		System.out.println("Sum of number is: "+s1.Sub(12,13));
		System.out.println("Sum of number is: "+s1.Sub(14,21));
	}
	
}
