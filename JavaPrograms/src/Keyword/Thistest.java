package Keyword;

 class Student {
	int rollno;
	String name;
	float fee;
	
	Student(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	
	
void display() {
	System.out.println(rollno+ " "+name+ " "+fee);
	
}
 }
  class Thistest{
	 public static void main(String args[]) {
		 
		 Student s1=new Student(12,"pradnya",6000);
		 Student s2=new Student(13,"Diksha",6500);
		 s1.display();
		 s2.display();
		 }
 }
	
 
