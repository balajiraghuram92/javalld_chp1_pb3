package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testConstructorWithCoordinates() {
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        assertEquals(1, rectangle.getTopLeft().getX());
        assertEquals(2, rectangle.getTopLeft().getY());
        assertEquals(3, rectangle.getBottomRight().getX());
        assertEquals(4, rectangle.getBottomRight().getY());
    }

    @Test
    public void testConstructorWithPoints() {
        Point topLeft = new Point(1, 2);
        Point bottomRight = new Point(3, 4);
        Rectangle rectangle = new Rectangle(topLeft, bottomRight);
        
        assertEquals(topLeft, rectangle.getTopLeft());
        assertEquals(bottomRight, rectangle.getBottomRight());
        
        // Verifies defensive copying (separate memory references)
        assertNotSame(topLeft, rectangle.getTopLeft());
        assertNotSame(bottomRight, rectangle.getBottomRight());
    }

    @Test
    public void testConstructorWithRectangle() {
        Rectangle originalRectangle = new Rectangle(1, 2, 3, 4);
        Rectangle copiedRectangle = new Rectangle(originalRectangle);
        
        assertEquals(originalRectangle.getTopLeft(), copiedRectangle.getTopLeft());
        assertEquals(originalRectangle.getBottomRight(), copiedRectangle.getBottomRight());
        
        // Verifies deep copying
        assertNotSame(originalRectangle.getTopLeft(), copiedRectangle.getTopLeft());
        assertNotSame(originalRectangle.getBottomRight(), copiedRectangle.getBottomRight());
    }

    @Test
    public void testConstructorWithInvalidArguments() {
        // Test null checks for Point parameters
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(null, new Point(3, 4));
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(new Point(1, 2), null);
        });

        // Test null check for copy constructor
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle((Rectangle) null);
        });
    }
}