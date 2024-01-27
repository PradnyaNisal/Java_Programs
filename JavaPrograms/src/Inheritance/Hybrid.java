package Inheritance;

 class GrandFather12 {
	 void display1() {
		 System.out.println("GrandFather");
	 }
 }
class Father extends GrandFather12{
	void display2() {
		System.out.println("Father");
	}
}
 class Son extends Father{
	 void display3() {
		 System.out.println("Son");
	 }
 }
 class  Dughter extends Father{
	 void display4() {
		 System.out.println("Douhter");
	 }
 }
 class Hybrid{
	 public static void main(String args[]) {
		
		 GrandFather12 gf=new GrandFather12();
		gf.display1();
		
		Father f=new Father();
		f.display2();
		
		Son s =new Son();
		s.display3();
		
		Dughter d=new Dughter();
		d.display4();
		 
	 }
 }