package com.assignment;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    /**
     * Constructs a {@code Rectangle} from two {@link Point} instances.
     * <p>
     * Both {@code topLeft} and {@code bottomRight} must be non‑null. If either
     * argument is {@code null} an {@link IllegalArgumentException} is thrown.
     * Defensive copies of the supplied points are stored to preserve
     * encapsulation.
     */
    public Rectangle(Point topLeft, Point bottomRight) {
        // Validate arguments – throw if any is null
        if (topLeft == null || bottomRight == null) {
            throw new IllegalArgumentException("Points cannot be null");
        }
        // Defensive copies
        this.topLeft = new Point(topLeft);
        this.bottomRight = new Point(bottomRight);
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new Point(x1, y1);
        this.bottomRight = new Point(x2, y2);
    }

    public Rectangle(Rectangle other) {
        if (other != null) { 
        this.topLeft = new Point(other.topLeft);
        this.bottomRight = new Point(other.bottomRight);
        }
        else {
            throw new IllegalArgumentException("Rectangle cannot be null");
        }
    }

    public Point getTopLeft() {
        return new Point(topLeft);
    }

    public Point getBottomRight() {
        return new Point(bottomRight);
    }


}
