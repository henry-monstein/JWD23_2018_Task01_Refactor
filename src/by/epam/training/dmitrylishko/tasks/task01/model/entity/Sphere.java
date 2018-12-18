package by.epam.training.dmitrylishko.tasks.task01.model.entity;

import by.epam.training.dmitrylishko.tasks.task01.model.exceptions.NegativeRadiusException;

public class Sphere extends Point3D {
    public static final double DEFAULT_RADIUS = 1;

    private double radius;

    public Sphere() {
        super();
        radius = DEFAULT_RADIUS;
    }

    public Sphere(double radius) throws NegativeRadiusException {
        super();
        setRadius(radius);
    }

    public Sphere(double x, double y, double z, double radius) throws NegativeRadiusException {
        super(x, y, z);
        setRadius(radius);
    }

    public Sphere(Point3D point, double radius) throws NegativeRadiusException {
        super(point);
        setRadius(radius);
    }

    public Sphere(Sphere sphere)throws NegativeRadiusException  {
        copy(sphere);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws NegativeRadiusException {
        if (radius <= 0) {
            throw new NegativeRadiusException("Radius is incorrect");
        }
        this.radius = radius;
    }

    private void copy(Sphere sphere) throws NegativeRadiusException {
        setRadius(sphere.radius);
        super.setLocation(sphere);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Sphere)) return false;
        if (!super.equals(o)) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.radius, radius) == 0;
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
