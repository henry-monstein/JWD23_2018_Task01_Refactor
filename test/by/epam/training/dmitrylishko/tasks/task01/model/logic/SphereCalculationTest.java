package by.epam.training.dmitrylishko.tasks.task01.model.logic;

import static org.testng.Assert.*;

import by.epam.training.dmitrylishko.tasks.task01.model.entity.Sphere;
import by.epam.training.dmitrylishko.tasks.task01.model.exceptions.NegativeRadiusException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SphereCalculationTest {
    private static Sphere sphere;
    private static SphereCalculation calculation;

    private static final double EPS = 1E-5;
    private static double x = 4;
    private static double y = 6;
    private static double z = 1;
    private static double radius = 3;

    @BeforeClass
    public static void setUpCalculation() {
        calculation = new SphereCalculation();
    }

    @BeforeClass
    public static void setUpSphere() {
        try {
            sphere = new Sphere(x, y, z, radius);
        } catch (NegativeRadiusException e) {
//
        }
    }

    @AfterClass
    public static void tearDownSphere() {
        sphere = null;
    }

    @AfterClass
    public static void tearDownCalculation() {
        calculation = null;
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testCallException() {
        calculation.surfaceArea(null);
    }

    @Test
    public void testSurfaceArea() {
        double area = 36 * SphereCalculation.PI;
        assertEquals(calculation.surfaceArea(sphere), area, EPS);
    }

    @Test
    public void testVolume() {
        double volume = 36 * SphereCalculation.PI;
        assertEquals(calculation.volume(sphere), volume, EPS);
    }

    @Test
    public void testVolumeRatio() {
        double newRadius = 9;
        try {
            Sphere sphere1 = new Sphere(newRadius);
            assertEquals(calculation.volumeRatio(sphere1, 0, 0, 1, 6)[1], 12.5, EPS);
        } catch (NegativeRadiusException e) {
//
        }
    }

    @Test
    public void testIsOrbByObj() {
        assertTrue(calculation.isSphere(sphere));
    }

    @Test
    public void testIsOrbByRad() {
        assertTrue(calculation.isSphere(radius));
    }

    @Test
    public void testIsOrbCrossCoordinatePlane() {
        assertTrue(calculation.isSphereCrossCoordinatePlane(sphere));
    }
}
