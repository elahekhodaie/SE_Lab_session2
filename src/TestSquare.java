import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class TestSquare {
    @Test
    public void testSquareComputeArea() {
        Shape square = new Square(10);
        assertEquals(100, square.computeArea(), 0);
    }

    @Test
    public void testSetSquareSide() {
        Square square = new Square(7);
        square.setSide(5);
        assertEquals(5, square.getSide(), 0);

    }
}
