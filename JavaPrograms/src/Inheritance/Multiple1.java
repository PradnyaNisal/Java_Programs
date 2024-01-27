package Inheritance;

interface Father11 {
 void display1();
 
}

interface Mother11{
	void displayMother();
}

class Child1 implements Father11,Mother11{
	public void display1()
	{
		System.out.println("Interface Father class");
	}
	public void display2() {
		
	System.out.println("Interface mother class");
	}
	
	public void display3(){
		System.out.println("Interface Son class");
		
	}
	@Override
	public void displayMother() {
		// TODO Auto-generated method stub
		
	}
}

class Multiple1{
	public static void main(String args[]) {
		Child1 c1=new Child1();
		c1.display1();
		c1.display2();
		c1.display3();
	}
}
