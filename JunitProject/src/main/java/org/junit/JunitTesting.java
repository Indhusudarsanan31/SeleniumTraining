package org.junit;
import org.junit.Test;

public class JunitTesting {

    @Test
	public void tC1() {
		System.out.println("Test Case 1");
	}

	@Ignore
	@Test
	public void tC2() {
		System.out.println("Test Case 2");
	}

	@BeforeClass
	public static void browserLaunch() {
		System.out.println("Browser Launch............");
	}

	@After
	public void endDate() {
		System.out.println("Test Case end date and time");
	}

	@Test
	public void tC3() {
		System.out.println("Test Case 3");
	}

	@AfterClass
	public static void closeBrowser() {
		System.out.println("Close the Browser......");
	}

	@Before
	public void startDate() {
		System.out.println("Test Case Start Date and Time");
	}

	@Test
	public void tC4() {
		System.out.println("Test Case 4");
	}

	@Test
	public void tC5() {
		System.out.println("Test Case 5");

	}

}
