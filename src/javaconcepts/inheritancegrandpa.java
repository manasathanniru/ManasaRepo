package javaconcepts; 
                            
public class inheritancegrandpa {
	
	    int model = 1980;
	    String s = "ford";
	  
	      public void engine()
	     {
	    	 System.out.println("grnadpa engine -1980's" );
	     }
	     public void features()
	     {
	    	 System.out.println("grandpa car features");
	     }
	     public static void main(String[] args) {
	    	
	    	 inheritancegrandpa ig = new inheritancegrandpa();
	    	 
	    	 System.out.println(ig.model);
	    	 ig.engine();
	    	 ig.features();
	    	 System.out.println(ig.model);
	 		

	}

}
