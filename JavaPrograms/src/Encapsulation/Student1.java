package Encapsulation;

public class Student1 {
	private
	int rno;
	float marks;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Student1(int rno, float marks) {
		super();
		this.rno = rno;
		this.marks = marks;
	}
	public Student1(int rno) {
		super();
		this.rno = rno;
	}
	public Student1(float marks) {
		super();
		this.marks = marks;
	}

}
