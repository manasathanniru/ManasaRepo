package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
  ArrayList ar = new ArrayList();
  
  ar.add(8);
  ar.add("hi");
  ar.add('m');
  ar.add(1.2);
  ar.add(10);
  
  for (int i=0; i<ar.size(); i++)
  {
	  System.out.println(ar.get(i));
	 
  
  }
     System.out.println(ar.lastIndexOf(ar));
	 
	 System.out.println(ar.size());
  
  
   System.out.println("******");
 
  ArrayList<String> ar1 = new ArrayList<String>();
  
  ar1.add("automation");
  ar1.add("training");
  ar1.add("class");
  
  
  
  for (int i=0; i<ar1.size(); i++)
  {
	  System.out.println(ar1.get(i));
  }
  System.out.println("*******");
	
ArrayList<String> ar2 = new ArrayList<String>();
  
  ar2.add("collections");
  ar2.add("concepts");
  ar2.add("arraylist");
	//addall
		ar1.addAll(ar2);
		 for (int i=0; i<ar1.size(); i++)
		  {
			  System.out.println(ar1.get(i));
		  }
		 System.out.println("*********");
		
		 //removeall
		 
		 ar1.removeAll(ar2);
		for (int i=0; i<ar1.size(); i++)
		  {
			  System.out.println(ar1.get(i));
		  }
		 
		 System.out.println("******");
 
	  System.out.println(ar1.containsAll(ar2));

	  System.out.println("****");
	  
	 System.out.println(ar1.equals(ar2));
	  
	 
	 System.out.println(ar1.indexOf(0));
	 
	 System.out.println(ar1.size());
	 
	 employee e1 = new employee("Baby",20,'A');
	 employee e2 = new employee("nat",21,'b');
	 employee e3 = new employee("less",20,'c');
	 
	 ArrayList<employee> ar3 = new  ArrayList<employee>();
	 
	 ar3.add(e1);
	 ar3.add(e2);
	 ar3.add(e3);
	 System.out.println("size:"+ar3.size());
	
	 for(int i=0;i<ar3.size();i++)
	 {
		 System.out.println(ar3.get(i));
	 }
	
	 Iterator<employee> it = ar3.iterator();
	 while(it.hasNext())
	 {
		 employee emp = it.next();
		 System.out.print(emp.name +" ");
		 System.out.print(emp.age +" ");
		 System.out.println(emp.grade);
	 }
	 
	 
	 
	 
	 
	 
	 
	}
	

}
