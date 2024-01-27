package Constructor;

public class EmployeePara {

	   int empId;  
	   String empName;  
		    
	   //parameterized constructor with two parameters
	   EmployeePara(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }  
	   void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  
		   
	   public static void main(String args[]){  
		EmployeePara obj1 = new EmployeePara(1234,"Pradnya............");  
		EmployeePara obj2 = new EmployeePara(5641,"sonuu...............");  
		obj1.info();  
		obj2.info();  
	   }  
}