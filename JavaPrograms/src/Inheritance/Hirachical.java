package Inheritance;

 class A  {
 void displayA() {
	 System.out.println("Class A");
	 }
}
  class B extends A{
	  void displayB() {
		  System.out.println("Class B");
	  }
  }
class C extends A{
	void displayC() {
		System.out.println("class C");
	}
}
class D extends A{
	void displayD() {
		System.out.println("Class D");
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
}
 class E extends B{
	 void display() {
		 System.out.println("Class E");
	 }
 }
 class  F extends B{
	 void display() {
		 System.out.println("Class F");
	 }
	
 }
 
 class G extends C{
	 void display() {
		 System.out.println("class G");
	 }
 }
 
 class H extends C{
	 void display() {
		 System.out.println("class H");
	 }
 }
 class I extends D{
	 void display() {
		 System.out.println("class I");
	 }
 }
 class Hirachical{
	 public static void main(String args[]) {
		A a=new A();
		a.displayA();
		B b=new B();
		b.displayB();
		C c=new C();
		c.displayC();
	 }
 }
 