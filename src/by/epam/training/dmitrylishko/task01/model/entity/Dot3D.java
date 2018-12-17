package by.epam.training.dmitrylishko.task01.model.entity;

import java.awt.*;
import java.util.Objects;

public class Dot3D {
    public static final double DEFAULT_X = 0;
    public static final double DEFAULT_Y = 0;
    public static final double DEFAULT_Z = 0;

    private double x;
    private double y;
    private double z;

    public Dot3D() {
        x = DEFAULT_X;
        y = DEFAULT_Y;
        z = DEFAULT_Z;
    }

    public Dot3D(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public Dot3D(Dot3D dot) {
        setLocation(dot);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double[] getLocation() {
        return new double[]{x, y, z};
    }

    public void setLocation(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public void setLocation(Dot3D dot) {
        if (dot == null) {
            throw new NullPointerException();
        }
        setLocation(dot.getX(), dot.getY(), dot.getZ());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Dot3D)) return false;
        Dot3D dot3D = (Dot3D) o;
        return Double.compare(dot3D.x, x) == 0 &&
                Double.compare(dot3D.y, y) == 0 &&
                Double.compare(dot3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 53;
        final double eps = 1E-4;
        int result = 1;
        result = prime * result + (int) (x / eps);
        result = prime * result + (int) (y / eps);
        result = prime * result + (int) (z / eps);
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
