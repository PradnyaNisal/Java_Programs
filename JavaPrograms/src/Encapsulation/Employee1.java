package Encapsulation;

public class Employee1 {

	public static void main(String[] args) {
		Emp e1  = new Emp(1,1000);
		Emp e2  = new Emp(2,5000);
		Emp e3  = new Emp(3,9000);
		System.out.println(e1.getEmpid());
		System.out.println(e1.getSalary());
		System.out.println(e2.getEmpid());
		System.out.println(e2.getSalary());
		System.out.println(e3.getEmpid());
		System.out.println(e3.getSalary());
	

	}

}
