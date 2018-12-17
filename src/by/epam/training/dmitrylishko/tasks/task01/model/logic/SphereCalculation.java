package by.epam.training.dmitrylishko.tasks.task01.model.logic;

import by.epam.training.dmitrylishko.tasks.task01.model.entity.Sphere;

public class SphereCalculation {
    public static final double PI = Math.PI;

    public static double surfaceArea(Sphere sphere) {
        isNull(sphere);
        return 4 * sphere.getRadius() * sphere.getRadius() * PI;
    }

    public static double volume(Sphere sphere) {
        isNull(sphere);
        return (4 * sphere.getRadius() * sphere.getRadius() * sphere.getRadius() * PI) / 3D;
    }

    public static double[] volumeRatio(Sphere sphere, double a, double b, double c, double d) {
        isNull(sphere);
        if (distanceToPlane(sphere, a, b, c, d) < sphere.getRadius()) {
            double high = sphere.getRadius() - distanceToPlane(sphere, a, b, c, d);
            double volumeCut = PI * high * high * (sphere.getRadius() - (high / 3D));
            double volumeLeft = volume(sphere) - volumeCut;
            return new double[]{1, volumeLeft / volumeCut};
        } else {
            return new double[]{0, 1};
        }
    }

    public static boolean isSphere(Sphere sphere) {
        isNull(sphere);
        return isSphere(sphere.getRadius());
    }

    public static boolean isSphere(double radius) {
        if (radius > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSphereCrossCoordinatePlane(Sphere sphere) {
        isNull(sphere);
        return distanceToPlane(sphere, 0, 0, 1, 0) < sphere.getRadius() ||
                distanceToPlane(sphere, 0, 1, 0, 0) < sphere.getRadius() ||
                distanceToPlane(sphere, 1, 0, 0, 0) < sphere.getRadius();
    }

    private static void isNull(Sphere sphere) {
        if (sphere == null) throw new NullPointerException();
    }

    private static double distanceToPlane(Sphere sphere, double a, double b, double c, double d) {
        return Math.abs(a * sphere.getX() + b * sphere.getY() + c * sphere.getZ() + d)
                / Math.sqrt(a * a + b * b + c * c);
    }
}
