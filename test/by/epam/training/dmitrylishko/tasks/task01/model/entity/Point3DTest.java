package by.epam.training.dmitrylishko.tasks.task01.model.entity;

import static org.testng.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Point3DTest {

    private Point3D point;

    private final static double EPS = 0;
    private double x = 3;
    private double y = 6;
    private double z = 1;

    @BeforeMethod
    public void setUpDot() {
        point = new Point3D(x, y, z);
    }

    @AfterMethod
    public void tearDownDot() {
        point = null;
    }

    @Test
    public void testDefaultConstructor() {
        Point3D point3D = new Point3D();
        assertEquals(point3D.getLocation(), new double[]{Point3D.DEFAULT_X, Point3D.DEFAULT_Y, Point3D.DEFAULT_Z});
    }

    @Test
    public void testParameterConstructor() {
        assertEquals(point.getLocation(), new double[]{x, y, z});
    }

    @Test
    public void testCopyConstructor() {
        Point3D point3D = new Point3D(point);
        assertTrue(point3D.equals(point));
    }

    @Test
    public void testGetX() {
        assertEquals(point.getX(), x, EPS);
    }

    @Test
    public void testSetX() {
        double newX = 57;
        point.setX(newX);
        assertEquals(point.getX(), newX, EPS);
    }

    @Test

    public void testGetY() {
        assertEquals(point.getY(), y, EPS);
    }

    @Test
    public void testSetY() {
        double newY = 35;
        point.setY(newY);
        assertEquals(point.getY(), newY, EPS);
    }

    @Test
    public void testGetZ() {
        assertEquals(point.getZ(), z, EPS);
    }

    @Test
    public void testSetZ() {
        double newZ = 13;
        point.setZ(newZ);
        assertEquals(point.getZ(), newZ, EPS);
    }

    @Test
    public void testGetLocation() {
        assertEquals(point.getLocation(), new double[]{x, y, z});
    }

    @Test
    public void testSetLocationByParamTest() {
        double newX = 57;
        double newY = 35;
        double newZ = 13;
        point.setLocation(newX, newY, newZ);
        assertEquals(point.getLocation(), new double[]{newX, newY, newZ});
    }

    @Test
    public void testSetLocationByDotTest() {
        point.setLocation(new Point3D());
        assertEquals(point.getLocation(), new double[]{Point3D.DEFAULT_X, Point3D.DEFAULT_Y, Point3D.DEFAULT_Z});
    }

    @Test
    public void testEquals() {
        Point3D point3D1 = new Point3D();
        Point3D point3D2 = new Point3D();
        assertTrue(point3D1.equals(point3D2));
    }

    @Test
    public void testHashCode() {
        Point3D point3D = new Point3D(x, y, z);
        assertEquals(point3D.hashCode(), point.hashCode());
    }
}
