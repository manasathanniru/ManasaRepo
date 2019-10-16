package javaconcepts;

public class calbyvalref {
	int p,q;
	
	
	public void swap(calbyvalref t)
	{  
		int temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
	
	  public static void main(String[] args) {
		
		  calbyvalref c = new calbyvalref();
		  
		  c.p=10;
		  c.q=20;
		  
		  c.swap(c);
	System.out.println("p value:"+c.p);
	
	System.out.println("q value :"+c.q);
	
	  
	  }
	  

}
