package Inheritance;

 class A12 {
	 void displayA() {
		 System.out.println("I am calss A");
	 }

}
class B1 extends  A12 {
	 void displayB() {
		 System.out.println("I am class B");
	 }
 }

class C11 extends  B1{
	void displayC() {
		System.out.println("I am class C");
	}
}

class Multilevel2{
	public static void main(String ars[]) {
		C11 c=new C11();
		c.displayA();
		c.displayB();
		c.displayC();
		
	}
}
