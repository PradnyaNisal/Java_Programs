package Encapsulation;

public class Student2 {

	public static void main(String[] args) {
		Student1 s1  = new Student1(1,78);
		Student1 s2  = new Student1(2,98);
		Student1 s3  = new Student1(3,65);
		
		
		System.out.println(s1.getRno());
		System.out.println(s1.getMarks());
		System.out.println(s2.getRno());
		System.out.println(s2.getMarks());
		System.out.println(s3.getRno());
		System.out.println(s3.getMarks());
	

	}

}
