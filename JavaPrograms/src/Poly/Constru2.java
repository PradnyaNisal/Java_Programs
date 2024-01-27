package Poly;

class Student {  
	
	int id;  
	String name;  
	  
	Student(){  
	System.out.println("this a default constructor");  
	}  
	  
	Student(int i, String n){  
	id = i;  
	name = n;  
	} 
	void display() {
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
	}
}
	
	class Constru2{
		

	public static void main(String[] args) {  
	  
//	Student s = new Student();  
	
	Student student = new Student(12, "Pradnya");  
	//System.out.println("Student Id : "+student.id + "Student Name : "+student.name);
	student.display();
	}  
	}  
