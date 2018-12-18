package by.epam.training.dmitrylishko.tasks.task01.model.entity;

import static org.testng.Assert.*;

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
        sphere = new Sphere(x, y, z, radius);
    }

    @AfterMethod
    public void tearDownSphere() {
        sphere = null;
    }

    @Test
    public void testDefaultConstructor() {
        Sphere defSphere=new Sphere();
        assertEquals(defSphere.getRadius(), defSphere.DEFAULT_RADIUS, EPS);
    }

    @Test
    public void testRadiusConstructor() {
        Sphere sphere1 = new Sphere(radius);
        assertEquals(sphere1.getRadius(), radius, EPS);
    }

    @Test
    public void testParameterConstructor() {
        assertEquals(sphere.getRadius(), radius, EPS);
    }

    @Test
    public void testDotConstructor() {
        Sphere sphere1 = new Sphere(new Point3D(), radius);
        assertEquals(sphere1.getRadius(), radius, EPS);
    }

    @Test
    public void testCopyConstructor() {
        Sphere sphere1 = new Sphere(sphere);
        assertEquals(sphere1, sphere);
    }

    @Test
    public void testGetRadius() {
        assertEquals(sphere.getRadius(), radius, EPS);
    }

    @Test
    public void testSetRadius() {
        double newRadius = 13;
        sphere.setRadius(newRadius);
        assertEquals(sphere.getRadius(), newRadius, EPS);
    }

    @Test
    public void testEquals() {
        Sphere sphere1=new Sphere();
        Sphere sphere2=new Sphere();
        assertTrue(sphere1.equals(sphere2));
    }

    @Test
    public void testHashCode() {
        Sphere sphere1 = new Sphere(x, y, z, radius);
        assertEquals(sphere1.hashCode(), sphere.hashCode());
    }
}
