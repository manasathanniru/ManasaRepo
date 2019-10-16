package javaconcepts;

public class inheritancechild extends inheritance{
	
	int model =2020;
	int wheels = 6;
	
	
	public void theftsafety()
	{
		System.out.println("child car theftsafety");
	System.out.println("wheels:"+super.wheels);
	
	
	}
	
	
	public void automaticsystem()
	{
		System.out.println("child car automatic system");
	}
	
	
	
	public static void main(String[] args) {
		
		inheritancechild ic = new inheritancechild();
		System.out.println(ic.model);
		System.out.println(ic.wheels);
		ic.theftsafety();
		ic.automaticsystem();
	}

}
