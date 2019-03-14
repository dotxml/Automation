import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(enabled = false)
	public void testCase1() {
		System.out.println("in test case 1");
	}

	@Test(enabled = false)
	public void testCase2() {
		System.out.println("in test case 2");
	}

}
