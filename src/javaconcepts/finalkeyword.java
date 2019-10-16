package javaconcepts;

public class finalkeyword {
	
	final public int a;
	
	finalkeyword(int a)  
	{
		this.a=a;
	}
	
	finalkeyword()
	{
		this(2);
	}
	

	public static void main(String[] args) {
		
		finalkeyword f = new finalkeyword(20);
		finalkeyword f1=new finalkeyword(12);
		
		System.out.println(f.a);
		System.out.println(f1.a);
		
		
		
		

	}

}
