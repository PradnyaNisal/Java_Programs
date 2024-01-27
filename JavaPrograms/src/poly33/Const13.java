package poly33;
 

		class Addition  {
			 int h ,p ,d;
			 float r ,s ,v;
			 Addition(int m ,int l) 
			 {
				h=m;
				p=l;
				d=h+p;
		    		
			 }

		     Addition(float w,float q)
		{
			r=w;
			s=q;
						
		}
		
	public void cal1() {
		d=h+p;
		System.out.println("Addition:"+d);
		
		
	}
	 Addition()
	 {
		 super();
	 }
}
		class Const13{
				
			 public static void main(String args[]) {
				 Addition a=new Addition(12,12); 
				 a.cal1();
				 }
				
		}
		




		




	


