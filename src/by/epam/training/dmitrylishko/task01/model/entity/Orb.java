package by.epam.training.dmitrylishko.task01.model.entity;

import by.epam.training.dmitrylishko.task01.model.exceptions.NegativeRadiusException;

public class Orb extends Dot3D {
    public static final double DEFAULT_RADIUS = 1;

    private double radius;

    public Orb() {
        super();
        radius = DEFAULT_RADIUS;
    }

    public Orb(double radius) {
        super();
        setRadius(radius);
    }

    public Orb(double x, double y, double z, double radius) {
        super(x, y, z);
        setRadius(radius);
    }

    public Orb(Dot3D dot, double radius) {
        super(dot);
        setRadius(radius);
    }

    public Orb(Orb orb) {
        copy(orb);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private void copy(Orb orb) {
        if (orb == null) {
            throw new NullPointerException();
        }
        setRadius(orb.radius);
        super.setLocation(orb);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Orb)) return false;
        if (!super.equals(o)) return false;
        Orb orb = (Orb) o;
        return Double.compare(orb.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 53;
        final double eps = 1E-4;
        int result = super.hashCode();
        result = prime * result + (int) (radius / eps);
        return result;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", center [" +
                "x=" + getX() +
                ", y=" + getY() +
                ", z=" + getZ() +
                "]}";
    }
}
