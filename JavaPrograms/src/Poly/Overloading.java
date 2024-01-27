package Poly;

 class A 
 {
	 int x;
	 float y;
	 double z;
	 
	public int Sum (int x,int y) {
		 return x+y;
	}
	public float sum(float a,float b) {
		return a+b;
	}
	public int sum (int s,int q,int r) {
			return s+q+r;
	}
	public float sum(float o,float b,float v) {
		return o+b+v;
	}
}

 class Overloading{
	 public static void main(String args[]) {
		 A a=new A();
	System.out.println("Sum of number is: "+a.Sum(12, 78));
	System.out.println("Sum  of number is "+a.sum(4, 30));
	System.out.println("Sum of number is "+a.sum(12, 2,3));
	System.out.println("Sum of number is"+a.sum(1, 20, 30));
	 }
 }