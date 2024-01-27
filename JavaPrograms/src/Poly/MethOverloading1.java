package Poly;

 class Multiplication{
	 int a;
	 float b;
	public int Multi(int a,int b) {
		 return  a*b;
	 }
	 public float Multi(float c,float d) {
		 return c*d;
	 }
}
class MethOverloading1{
	public static void main(String args[]) {
		Multiplication m=new Multiplication();
		System.out.println("Sum of number is: "+m.Multi(12, 78));
		System.out.println("Sum of number is: "+m.Multi(12, 13));
	}
}