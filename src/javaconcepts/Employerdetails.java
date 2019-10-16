package javaconcepts;

public class Employerdetails {
	
	int employerid;
	String employername;
	char grade;
	int salary;
	int payment;
	
	public Employerdetails(int employerid, String employername, char grade, int salary,int payment)
	{
	
	  this.employerid=13;
      this.employername= employername;
      this.grade=  grade ;
      this .salary= 2400;
      this.payment= 30;
      
      System.out.println("employerdetails:"+this.employerid);
      System.out.println("employerdetails:"+employername);
	  System.out.println("employerdetails:"+salary);
	  System.out.println("employerdetail:"+grade);
	  System.out.println(payment);
	}

	
	      public static void main(String[] args) {
		
		Employerdetails e = new Employerdetails(10,"bala",'x',2300,20);
		
		  System.out.println("employerdetails:"+e.employerid);
		  System.out.println("payment:"+e.payment);   
		  System.out.println("employerdetails:"+e.employername);
	}

}
