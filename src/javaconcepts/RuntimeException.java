package javaconcepts;

public class RuntimeException {

	public static void main(String[] args) {
		
		int a=8;
		int b=0;
		try {
			
			int c=a/b;
			System.out.println("c="+c);
		}
		catch (Throwable t)
		{
			System.out.println("t="+t.getMessage());
		}
		finally
		{
			System.out.println("execution done");
		}
		
		
	}

}
