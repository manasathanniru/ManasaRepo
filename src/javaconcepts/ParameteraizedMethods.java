package javaconcepts;

public class ParameteraizedMethods {
	
	// parametarized/loaded method values

	  int e=9,f;
	  
	  public void sum(int g,int h)

	  
	  {
	      int l=g;
	      int n=h;
	      int i=g+h;
	     
	     System.out.println("the value of i:"+i);
	}
	  
	  public void sub()
	  {
		  int a= 2;
		  int b=2;
		  int c=a-b;
	  }

       public static void main(String[] args) {
		
    	   ParameteraizedMethods p = new ParameteraizedMethods();
    	   
    	   p.sum(10,11);
	       p.sub();
	
	
	}

}
