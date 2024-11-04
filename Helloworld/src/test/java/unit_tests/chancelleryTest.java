package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import сhancellery.Eraser;
import сhancellery.Pencil;

public class chancelleryTest {

    @Test (groups = "positive test")
    public void checkThatNewPencilColorisWhite (){
        Pencil newPencil = new Pencil(false, "black", 2.3, "Derl");
        Assert.assertEquals(newPencil.getRefillColor(),"white", "Refill color is not white as expected");
    }

    @Test (groups = "positive test")
    public void checkThatEraserPriceIsNotZero () {
        Eraser newEraser = new Eraser("pink", "square", 2.5, "Lods", 2.1);
        Assert.assertNotEquals(newEraser.getPrice(), 0, "Eraser price shouldn't be zero");
    }

    @Test (groups = "positive test")
    public void checkThatUserPencilContainsEraser () {
        Pencil newPencil = new Pencil(true, "blue", 2.4, "locket");
        Assert.assertTrue(newPencil.getContainsEraser(), "New pencil contains eraser");
    }
}
