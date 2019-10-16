package javaconcepts;

public class constructors {
	
	String name,color,a,b;
	int c=20;
	public constructors()
	{
		name="lily";
		color="white";
     }
	public constructors(String n,String m)
	{
		 a=n;
		 b=m; 
		
	System.out.println(c);
	}

	public void display()
	{
		System.out.println(name+" "+color);
		
	}
	public void display2()
	{
		System.out.println(a+" "+b);
		
	}
	
	public static void main(String[] args) {
		
		constructors c=new constructors();
		c.display();
		constructors c1= new constructors("pink","yellow");
		c1.display2();
		constructors c2 = new constructors();
		c2.display();
		
	
		
		
		
	}

}
