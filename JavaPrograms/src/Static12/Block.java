package Static12;

public class Block {  
	
	static int rno;
	static String name;
	static int userid;
	static String username;
	
	static {
		rno=2;
		name="Pradnya ";

	}

	static {    // more than one block 
		userid=122;
		username="Pradnya nisal ";

	}

	
	public static void main(String[] args) {
		
		System.out.println("RollNo : "+rno);
		
		System.out.println("Name: "+name);
		
		System.out.println("userid: "+userid);
		
		System.out.println("userName: "+username);
	}

}

