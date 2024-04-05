package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class JUnitAnnotations {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("in before class");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("in afterclass class");
	}
	@Before
	public static void before() {
		System.out.println("in before class");
	}
	@After
	public static void after() {
		System.out.println("in after class");
	}
	@Test
	public static void test() {
		System.out.println("in test1 class");
	}
	@Test
	public static void test1() {
		System.out.println("in test2 class");
	}
	@Ignore
	public static void ignore() {
		System.out.println("in ignore class");
	}
	

}
