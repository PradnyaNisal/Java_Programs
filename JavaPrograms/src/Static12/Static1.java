package Static12;

public class Static1 {

	static float rate=10;
	float principal,duration, sim_int,total;
	
Static1 (float x,float y) {
	principal=x;
	duration=y;
	
	//System.out.println("Enter principal amount and duration");
    //System.out.println("duration");
}
void calculate(){

	sim_int=(principal*rate*duration)/100;
	total=sim_int+principal;
}
 
void display() {
	
	System.out.println("Simple Interest= "+sim_int);
	
    System.out.println("Total Amount  Received= "+total);
    System.out.println("simple intrest "+sim_int);
}

}
