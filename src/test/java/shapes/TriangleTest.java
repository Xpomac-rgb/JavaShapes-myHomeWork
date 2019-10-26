package shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(2, 3, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validatorTest() {
        new Triangle(0, 0, 0);
        new Triangle(-3, -4, -5);
        new Triangle(1, 2, 3);
    }

    @Test
    public void getPerimeterTest() {
        assertEquals(9, triangle.getPerimeter(), 0);
    }

    @Test
    public void getSquareTest() {
        assertEquals(2.9047375096556, triangle.getSquare(), 0.001);
    }

    @Test
    public void toStringTest() {
        String toString = "треугольник\nпервая сторона: 2.0\nвторая сторона: 3.0\nтретья сторона: 4.0\n" +
                "периметр: 9.0\nплощадь: 2.9047375096555625";
        assertEquals(toString, triangle.toString());
    }

    @Test
    public void equalsTest() {
        Triangle triangle = new Triangle(2, 3, 4);
        assertEquals(this.triangle, triangle);
    }

}