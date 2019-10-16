package collections;

public class employee {
	
	String name;
	int age;
	char grade;
	
	employee(String name, int age , char grade)
	
	{
	
    this.name=name;
	this.age=age;
	this.grade=grade;
	
	}
	public void display()
	{
		System.out.println("print values:"+name +age +grade);
	}
	public static void main(String[] args) {
	
		employee e1 = new employee("Baby",20,'A');
	    e1.display();
		employee e2 = new employee("nat",21,'b');
	   e2.display();
		employee e3 = new employee("less",20,'c');
	e3.display();
	
	}
}
