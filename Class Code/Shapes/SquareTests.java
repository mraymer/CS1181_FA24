import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTests {

    @Test
    public void testDefaultLocation(){
        Square s1 = new Square();
        String s1Location = s1.getLocation();
        assertEquals("(0, 0)", s1Location);
    }

    @Test
    public void testDefaultArea(){
        Square s1 = new Square();
        double s1Area = s1.getArea();
        assertEquals(1.0, s1Area, 0.01);
    }

}
