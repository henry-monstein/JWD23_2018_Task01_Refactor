package by.epam.training.dmitrylishko.task01.model.entity;

import static org.testng.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrbTest {
    private Orb orb;

    private static final double EPS = 0;
    private double x = 3;
    private double y = 6;
    private double z = 1;
    private double radius = 5;

    @BeforeMethod
    public void setUpOrb() {
        orb = new Orb(x, y, z, radius);
    }

    @AfterMethod
    public void tearDownOrd() {
        orb = null;
    }

    @Test
    public void testDefaultConstructor() {
        Orb defOrb = new Orb();
        assertEquals(defOrb.getRadius(), Orb.DEFAULT_RADIUS, EPS);
    }

    @Test
    public void testRadiusConstructor() {
        Orb orb1 = new Orb(radius);
        assertEquals(orb1.getRadius(), radius, EPS);
    }

    @Test
    public void testParameterConstructor() {
        assertEquals(orb.getRadius(), radius, EPS);
    }

    @Test
    public void testDotConstructor() {
        Orb orb1 = new Orb(new Dot3D(), radius);
        assertEquals(orb1.getRadius(), radius, EPS);
    }

    @Test
    public void testCopyConstructor() {
        Orb orb1 = new Orb(orb);
        assertEquals(orb1, orb);
    }

    @Test
    public void testGetRadius() {
        assertEquals(orb.getRadius(), radius, EPS);
    }

    @Test
    public void testSetRadius() {
        double newRadius = 13;
        orb.setRadius(newRadius);
        assertEquals(orb.getRadius(), newRadius, EPS);
    }

    @Test
    public void testEquals() {
        Orb orb1 = new Orb();
        Orb orb2 = new Orb();
        assertTrue(orb1.equals(orb2));
    }

    @Test
    public void testHashCode() {
        Orb orb1 = new Orb(x, y, z, radius);
        assertEquals(orb1.hashCode(), orb.hashCode());
    }
}
