import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

    String className = "HardAssertion";

    @Test
    public void test_UsingHardAssertion() {
        Assert.assertTrue(true == true);
        Assert.assertEquals("HardAssertion", "HardAssertion");
        Assert.assertEquals(className, "HardAssertion");
        System.out.println("Successfully passed!");
    }
    
    @Test
    public void test_UsingHardAssertion1() {
        Assert.assertTrue(true == true);
        Assert.assertEquals("HardAssert", "HardAssertion","This method failed");
        Assert.assertEquals(className, "HardAssertion");
        System.out.println("Successfully passed!");
    }
}