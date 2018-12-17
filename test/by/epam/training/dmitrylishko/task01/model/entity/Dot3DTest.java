package by.epam.training.dmitrylishko.task01.model.entity;

import static org.testng.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dot3DTest {

    private Dot3D dot;

    private final static double EPS = 0;
    private double x = 3;
    private double y = 6;
    private double z = 1;

    @BeforeMethod
    public void setUpDot() {
        dot = new Dot3D(x, y, z);
    }

    @AfterMethod
    public void tearDownDot() {
        dot = null;
    }

    @Test
    public void testDefaultConstructor() {
        Dot3D dot3D = new Dot3D();
        assertEquals(dot3D.getLocation(), new double[]{Dot3D.DEFAULT_X, Dot3D.DEFAULT_Y, Dot3D.DEFAULT_Z});
    }

    @Test
    public void testParameterConstructor() {
        assertEquals(dot.getLocation(), new double[]{x, y, z});
    }

    @Test
    public void testCopyConstructor() {
        Dot3D dot3D = new Dot3D(dot);
        assertTrue(dot3D.equals(dot));
    }

    @Test
    public void testGetX() {
        assertEquals(dot.getX(), x, EPS);
    }

    @Test
    public void testSetX() {
        double newX = 57;
        dot.setX(newX);
        assertEquals(dot.getX(), newX, EPS);
    }

    @Test

    public void testGetY() {
        assertEquals(dot.getY(), y, EPS);
    }

    @Test
    public void testSetY() {
        double newY = 35;
        dot.setY(newY);
        assertEquals(dot.getY(), newY, EPS);
    }

    @Test
    public void testGetZ() {
        assertEquals(dot.getZ(), z, EPS);
    }

    @Test
    public void testSetZ() {
        double newZ = 13;
        dot.setZ(newZ);
        assertEquals(dot.getZ(), newZ, EPS);
    }

    @Test
    public void testGetLocation() {
        assertEquals(dot.getLocation(), new double[]{x, y, z});
    }

    @Test
    public void testSetLocationByParamTest() {
        double newX = 57;
        double newY = 35;
        double newZ = 13;
        dot.setLocation(newX, newY, newZ);
        assertEquals(dot.getLocation(), new double[]{newX, newY, newZ});
    }

    @Test
    public void testSetLocationByDotTest() {
        dot.setLocation(new Dot3D());
        assertEquals(dot.getLocation(), new double[]{Dot3D.DEFAULT_X, Dot3D.DEFAULT_Y, Dot3D.DEFAULT_Z});
    }

    @Test
    public void testEquals() {
        Dot3D dot3D1 = new Dot3D();
        Dot3D dot3D2 = new Dot3D();
        assertTrue(dot3D1.equals(dot3D2));
    }

    @Test
    public void testHashCode() {
        Dot3D dot3D = new Dot3D(x, y, z);
        assertEquals(dot3D.hashCode(), dot.hashCode());
    }
}
