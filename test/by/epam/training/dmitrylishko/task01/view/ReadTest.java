package by.epam.training.dmitrylishko.task01.view;

import static org.testng.Assert.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadTest {
    private String fileName = ".\\resources\\input.txt";
    private Read read;

    private String[] fileContent = {"3.8 5.848 4.84 5.1",
            "4.45434 5.447 8.88 3.74",
            "4y.545 54.44 454.544 45.4",
            "4.545 54.44 454.544 -45.4",
            "-4.5745 -4.87 -5.54 7.023",
            "45.474 454.44 45.45 50.4"};

    @BeforeMethod
    public void setUpRead() {
        read = new Read();
    }

    @AfterMethod
    public void tearDownRead() {
        read = null;
    }

    @Test
    public void testReedFromFile() {
        assertEquals(read.readFromFile(fileName), fileContent);
    }
}
