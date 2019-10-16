package javaconcepts;

public class overloading {
	  int m=5;
	  int n=7;
	public void sum()
	{
		int a,b,c;
	    a=1;
		b=2;
		c=a+b;
		System.out.println("value of c:"+c);
		
		
	}
	     //calbyval
	
	public void sum (int x,int y)
	{
		x=5;
		y=4;
		int z=x+y;
		System.out.println("value of z="+z);
	}
	
	

	public static void main(String[] args) {
		overloading o = new overloading();
		
				o.sum(1,2);
				

	}

}
