package ClassesObject;

public class Student2 {

	public static void main(String[] args) {
		 int i;
		 Student1[]obj;
		 
		 obj = new Student1[5];
		 for(i=0;i<5;i++){
			 
			 obj[i]=new Student1();
		 }
			 for (i=0;i<5;i++) {
				 
				 obj[i].getdata();
				 obj[i].dispy();
				 
			 }
		 

	}

}