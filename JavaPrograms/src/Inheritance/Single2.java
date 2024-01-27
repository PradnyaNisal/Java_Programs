package Inheritance;

 class Doctor {
	 void displayDoc() {
		 System.out.println("Iam doctor");
		 
	 }
}
 class Surgeon extends Doctor{
	 void displaysur() {
		 System.out.println("Iam surgeon");
	 }
 }
 
 class Single2{
	 
	public static void main(String args[]) {
		
		Surgeon s=new Surgeon();
		s.displayDoc();
		s.displaysur();
		
		
	}
 }