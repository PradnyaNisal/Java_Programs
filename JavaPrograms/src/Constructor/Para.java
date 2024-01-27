package Constructor;

public class Para {

int p1,p2,add;
	
   Para(int x ,int y)
	{
		System.out.println("This is parameteerize constructor");
	p1=x;
	p2=y;
	}
	
	void cal()
	{
		add=p1+p2;
		System.out.println("Result is "+ add);
}
}