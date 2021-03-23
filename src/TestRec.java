import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRec {
    Rectangle rectangle = new Rectangle(5,10);


    @Test
    public void testRectangleComputeArea() {
        assertEquals(50, rectangle.computeArea(), 0);
    }

    @Test
    public void testSetRectangleWidth() {
        Rectangle rectangle = new Rectangle(5,10);
        rectangle.setWidth(25);
        assertEquals(25, rectangle.getWidth(),0);
    }

    @Test
    public void testSetRectangleHeight() {
        Rectangle rectangle = new Rectangle(5,10);
        rectangle.setHeight(20);
        assertEquals(20, rectangle.getHeight(),0);
    }


}