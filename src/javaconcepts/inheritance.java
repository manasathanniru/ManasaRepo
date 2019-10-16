package javaconcepts;

public class inheritance extends inheritancegrandpa {
	
	int wheels = 4;
	
	public void start()
	{
		System.out.println("parent car start");
	}
	public void stop ()
	{
		System.out.println("parent car stop");
	}
	 public void engine()
     {
    	 System.out.println("parent engine -2000" );
    super.engine();
     
     }
	public static void main(String[] args) {
		
		inheritance ip = new inheritance();
		System.out.println(ip.wheels);
		
		ip.start();
		ip.stop();
		ip.engine();
		
		
		

	}

}
