package collections;

import java.util.LinkedList;

public class LinkedListdemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("hello");
		ll.add("mean");
		ll.add("object");
		ll.add("subject");
		
		System.out.println("size of ll:"+ll.size());
		System.out.println(ll);
		System.out.println("index value of 3: "+ll.get(3));
		System.out.println(ll.isEmpty());
	/*	ll.clear();
		System.out.println();*/
		
		
		LinkedList<String> ll1 = new LinkedList<String>();
		
		ll1.add("hello");
		ll1.add("mean");
		ll1.add("object");
		ll1.add("subject");
		
	
		System.out.println("checking equal method:"+ll.equals(ll1));
		
		System.out.println(ll.containsAll(ll1));
			
		
	
		
	
	
		
		
		
		
		
		
		
		

	}

}
