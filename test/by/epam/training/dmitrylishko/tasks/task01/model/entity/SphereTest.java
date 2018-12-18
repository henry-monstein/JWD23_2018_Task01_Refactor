package by.epam.training.dmitrylishko.tasks.task01.model.entity;

import static org.testng.Assert.*;

import by.epam.training.dmitrylishko.tasks.task01.model.exceptions.NegativeRadiusException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SphereTest {
    private Sphere sphere;

    private static final double EPS = 0;
    private double x = 3;
    private double y = 6;
    private double z = 1;
    private double radius = 5;

    @BeforeMethod
    public void setUpSphere() {
        try {
            sphere = new Sphere(x, y, z, radius);
        } catch (NegativeRadiusException e) {

        }
    }

    @AfterMethod
    public void tearDownSphere() {
        sphere = null;
    }

    @Test
    public void testDefaultConstructor() {
        Sphere defSphere = new Sphere();
        assertEquals(defSphere.getRadius(), defSphere.DEFAULT_RADIUS, EPS);
    }

    @Test
    public void testRadiusConstructor() {
        try {
            Sphere sphere1 = new Sphere(radius);
            assertEquals(sphere1.getRadius(), radius, EPS);
        } catch (NegativeRadiusException e) {
//
        }
    }

    @Test
    public void testParameterConstructor() {
        assertEquals(sphere.getRadius(), radius, EPS);
    }

    @Test
    public void testDotConstructor() {
        try {
            Sphere sphere1 = new Sphere(new Point3D(), radius);
            assertEquals(sphere1.getRadius(), radius, EPS);
        } catch (NegativeRadiusException e) {
//
        }
    }

    @Test
    public void testCopyConstructor() {
        try {
            Sphere sphere1 = new Sphere(sphere);
            assertEquals(sphere1, sphere);
        } catch (NegativeRadiusException e) {
//
        }
    }

    @Test
    public void testGetRadius() {
        assertEquals(sphere.getRadius(), radius, EPS);
    }

    @Test
    public void testSetRadius() {
        double newRadius = 13;
        try {
            sphere.setRadius(newRadius);
            assertEquals(sphere.getRadius(), newRadius, EPS);
        } catch (NegativeRadiusException e) {
//
        }
    }

    @Test
    public void testEquals() {
        Sphere sphere1 = new Sphere();
        Sphere sphere2 = new Sphere();
        assertTrue(sphere1.equals(sphere2));
    }

    @Test
    public void testHashCode() {
        try {
            Sphere sphere1 = new Sphere(x, y, z, radius);
            assertEquals(sphere1.hashCode(), sphere.hashCode());
        } catch (NegativeRadiusException e) {
//
        }
    }
}
