package ClassesObject;

public class Emp2 {

	public static void main(String[] args) {
	
		 int i;
		 Employee1[]obj;
		 obj = new Employee1[5];
		 
		 for(i=0;i<5;i++){
			 obj[i]=new Employee1();
			 
		 }
		 for (i=0;i<5;i++) {
			 
			 obj[i].getdata();
			 obj[i].disp();
			 
	}

}
}
