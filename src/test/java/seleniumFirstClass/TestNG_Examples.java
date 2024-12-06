package seleniumFirstClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Examples {
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is @AfterSuite Annotation");
	}
	
	@Test
	public void test_1() {
		System.out.println("This is @Test_1 Annotation");
	}
	
	@Test
	public void test_2() {
		System.out.println("This is @Test_2 Annotation");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is @BeforeSuite Annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest Annotation");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is @AfterTest Annotation");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is @BeforeClass Annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is @AfterClass Annotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is @@BeforeMethod Annotation");
	}
		
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This is @@AfterMethod Annotation");
	}	
	
	

}
