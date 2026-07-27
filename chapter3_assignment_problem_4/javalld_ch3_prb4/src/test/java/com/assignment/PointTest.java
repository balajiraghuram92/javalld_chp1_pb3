package com.assignment;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void testConstructor() {
        Point point = new Point(3, 4);
        assertEquals(3, point.getX());
        assertEquals(4, point.getY());
    }

    @Test
    public void testConstructorNeg() {
        Point point = new Point(-3, -4);
        assertEquals(-3, point.getX());
        assertEquals(-4, point.getY());
    }

    @Test
    public void testEq() {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(3, 4);
        assertEquals(point1, point2);

        Point point3 = new Point(5, 6);
        assertNotEquals(point1, point3);
    }

    @Test
    public void testStr() {
        Point point = new Point(3, 4);
        assertEquals("(3, 4)", point.toString());
    }

    @Test
    public void testCopy() {
        Point point = new Point(3, 4);
        Point pointCopy = new Point(point); // Using a copy constructor
        assertEquals(point, pointCopy);
        assertNotSame(point, pointCopy); // Equivalent to Python's assertIsNot

        pointCopy.setX(5);
        assertNotEquals(point.getX(), pointCopy.getX());
    }

    @Test
    public void testDeepcopy() {
        Point point = new Point(3, 4);
        Point pointDeepcopy = new Point(point);
        assertEquals(point, pointDeepcopy);
        assertNotSame(point, pointDeepcopy);

        pointDeepcopy.setX(5);
        assertNotEquals(point.getX(), pointDeepcopy.getX());
    }
}