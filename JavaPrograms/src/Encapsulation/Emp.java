package Encapsulation;

public class Emp {
private
	int empid;
	float salary;
	//getter and setter method
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Emp(int empid, float salary) {
		
		this.empid = empid;
		this.salary = salary;
	}
	public Emp(int empid) {
		
		this.empid = empid;
	}
	public Emp(float salary) {
		
		this.salary = salary;
	}
	public Emp() {
		super();
	}
	

}
