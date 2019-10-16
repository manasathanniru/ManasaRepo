package TestNGConcepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreAnnotations {
	
	@Test
	public void test1() {
		
		System.out.println("this is test 1");
		}
	@Ignore
	@Test
	public void test2() {
		
		System.out.println("this is test 2");
		}
	@Ignore
	@Test
	public void test3() {
		
		System.out.println("this is test 3");
		}
	@Test
	public void test4() {
		
		System.out.println("this is test 4");
		}
	
	
	
}
