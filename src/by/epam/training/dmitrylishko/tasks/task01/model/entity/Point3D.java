package by.epam.training.dmitrylishko.tasks.task01.model.entity;

public class Point3D {
    public static final double DEFAULT_X = 0;
    public static final double DEFAULT_Y = 0;
    public static final double DEFAULT_Z = 0;

    private double x;
    private double y;
    private double z;

    public Point3D() {
        x = DEFAULT_X;
        y = DEFAULT_Y;
        z = DEFAULT_Z;
    }

    public Point3D(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public Point3D(Point3D point) {
        setLocation(point);
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

    public void setLocation(Point3D point) {
        setLocation(point.getX(), point.getY(), point.getZ());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.x, x) == 0 &&
                Double.compare(point3D.y, y) == 0 &&
                Double.compare(point3D.z, z) == 0;
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
