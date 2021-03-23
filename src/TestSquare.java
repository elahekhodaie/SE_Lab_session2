import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class TestSquare {
    @Test
    public void testSquareComputeArea() {
        Shape square = new Square(10);
        assertEquals(100, square.computeArea(), 0);
    }
	
}
