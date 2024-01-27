package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class TestNGParametersDemo {

	@Test
	@Parameters({"MyName"})
	public void test(@Optional("Wilson") String name) {
		System.out.println("Name is : "+name);
	}
}
