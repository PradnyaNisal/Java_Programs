package Scanner;
import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		int a,b,add,sub,mul,div,mod;
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter first Number:");
		 
		 a = sc.nextInt();
		 System.out.println("Enter Second Number:");
		 
		 b = sc.nextInt();
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
	
		System.out.println("Addition :"+add);
		System.out.println("substraction :" +sub);
		System.out.println("Multiplication :" +mul);
		System.out.println("Division :" +div);
		System.out.println("ReminderS :" +mod);
		
		sc.close();

}
}
