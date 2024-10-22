package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import сhancellery.Pencil;

public class secondTest {

    @Test (groups = "negative test")
    public void checkThatTestFailsifAisGreaterThanB() {
        Assert.assertTrue(Pencil.negativeTest(29,1), "A is greater than B");
    }

    @Test (groups = "positive test")
    public void checkThatResultIsNotEqualToFive () {
        Assert.assertNotEquals(Pencil.positiveTest(23,12), 5);
    }
}
