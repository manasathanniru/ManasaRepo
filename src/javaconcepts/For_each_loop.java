package javaconcepts;

public class For_each_loop {

	public static void main(String[] args) {
		
		int i[]= new int[5];
		
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 i[4]=50;
		 
		System.out.println("i:"+i.length);
		 
		for(int j: i)
		 {
			 System.out.println(j);
		 }
		
	}

}
