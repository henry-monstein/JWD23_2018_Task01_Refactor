package by.epam.training.dmitrylishko.task01.view;

import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidatorTest {
    private Read read;
    private Validator validator;
    private String fileName = ".\\resources\\input.txt";
    private String filePointsName = ".\\resources\\inputPoints.txt";

    @BeforeClass
    public void setUpRead() {
        read = new Read();
    }

    @BeforeClass
    public void setUpValidator() {
        validator = new Validator();
    }

    @AfterClass
    public void tearDownRead() {

    }

    @AfterClass
    public void tearDownValidator() {

    }

    @Test
    public void testReadOrbVariables() {
        String[] lines = read.readFromFile(fileName);
        double[][] arr = {{3.8, 5.848, 4.84, 5.1},
                {4.45434, 5.447, 8.88, 3.74},
                {-4.5745, -4.87, -5.54, 7.023},
                {45.474, 454.44, 45.45, 50.4}};
        double[][] array = validator.readOrbVariables(lines);
        assertEquals(array, arr);
    }

    @Test
    public void testReadDotVariables() {
        String[] lines = read.readFromFile(filePointsName);
        double[][] arr = {{3.8, 5.848, 4.84},
                {4.45434, 5.447, 8.88},
                {4.545, 54.44, 454.544},
                {-4.5745, -4.87, -5.54},
                {45.474, 454.44, 45.45}};
        double[][] array = validator.readDotVariables(lines);
        assertEquals(array, arr);
    }

}
