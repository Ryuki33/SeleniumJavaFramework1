package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test
	public void onetest() {
		System.out.println("This is test 1");
	}
	
	@Test(priority=1)
	public void twotest() {
		System.out.println("This is test 2");
	}
	
	@Test(priority=1)
	public void threetest() {
		System.out.println("This is test 3");
	}
}
