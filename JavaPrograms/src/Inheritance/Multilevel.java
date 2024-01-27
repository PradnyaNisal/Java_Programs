package Inheritance;

 class grandfather2 {

	 void displaygrandfather() {
		 System.out.println("this is grandfather");
		 }
}

 class father1 extends grandfather2{
	 void displafather() {
		 System.out.println("this is  father");
		 
	 }
 }
 
 class Son12 extends father1{
	 void displayson() {
		 System.out.println("this is son ");
	 }
 }
 
 class Multilevel{
	 public static void main(String args[]) {
		 Son12 s=new Son12();
		 s.displaygrandfather();
		 s.displafather();
		 s.displayson();
	 }
 }