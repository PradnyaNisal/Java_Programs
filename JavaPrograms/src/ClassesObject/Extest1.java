package ClassesObject;



public class Extest1  {
		 public static void main(String[] args) {
			 double vol;
			
			 TestDemo obj=new TestDemo();
			 
			 obj.a=10.0;
			 obj.b=20.0;
			 obj.c=30.0;
			 vol=obj.a*obj.b*obj.c;
			 obj.display();
			 System.out.println("Volue of 3d object is"+vol);
		 }
	 }
	


