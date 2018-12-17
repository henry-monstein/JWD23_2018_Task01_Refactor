package by.epam.training.dmitrylishko.task01.model.logic;

import static org.testng.Assert.*;

import by.epam.training.dmitrylishko.task01.model.entity.Orb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrbCalculationTest {
    private static Orb orb;

    private static final double EPS = 1E-5;
    private static double x = 4;
    private static double y = 6;
    private static double z = 1;
    private static double radius = 3;

    @BeforeClass
    public void setUpOrb() {
        orb = new Orb(x, y, z, radius);
    }

    @AfterClass
    public void tearDown() {
        orb = null;
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testCallException() {
        OrbCalculation.surfaceArea(null);
    }

    @Test
    public void testSurfaceArea() {
        double area = 36 * OrbCalculation.PI;
        assertEquals(OrbCalculation.surfaceArea(orb), area, EPS);
    }

    @Test
    public void testVolume() {
        double volume = 36 * OrbCalculation.PI;
        assertEquals(OrbCalculation.volume(orb), volume, EPS);
    }

    @Test
    public void testVolumeRatio() {
        double newRadius = 9;
        Orb orb1 = new Orb(newRadius);
        assertEquals(OrbCalculation.volumeRatio(orb1, 0, 0, 1, 6)[1], 12.5, EPS);
    }

    @Test
    public void testIsOrbByObj() {
        assertTrue(OrbCalculation.isOrb(orb));
    }

    @Test
    public void testIsOrbByObjFail() {

        assertTrue(OrbCalculation.isOrb(orb));
    }

    @Test
    public void testIsOrbByRad() {
        assertTrue(OrbCalculation.isOrb(radius));
    }

    @Test
    public void testIsOrbCrossCoordinatePlane() {
        assertTrue(OrbCalculation.isOrbCrossCoordinatePlane(orb));
    }
}
