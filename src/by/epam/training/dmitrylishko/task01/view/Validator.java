package by.epam.training.dmitrylishko.task01.view;

import java.util.ArrayList;
import java.util.List;

public class Validator {
    private static final int AMOUNT_OF_VARIABLES_ORB = 4;
    private static final int AMOUNT_OF_VARIABLES_DOT = 3;

    public double[][] readOrbVariables(String... lines) {
        List<double[]> variables = new ArrayList<>();
        for (String line : lines) {
            double[] variablesLine = new double[AMOUNT_OF_VARIABLES_ORB];
            String[] splitline = parseLine(line, AMOUNT_OF_VARIABLES_ORB);
            for (int j = 0; j < AMOUNT_OF_VARIABLES_ORB; j++) {
                try {
                    variablesLine[j] = Double.valueOf(splitline[j]);
                } catch (NumberFormatException e) {
//                    something into logger
                    break;
                }
            }
            if (variablesLine[3] > 0) {
                variables.add(variablesLine);
            }
        }
        return variables.toArray(new double[variables.size()][AMOUNT_OF_VARIABLES_ORB]);
    }

    public double[][] readDotVariables(String... lines) {
        List<double[]> variables = new ArrayList<>();
        for (String line : lines) {
            boolean flag = true;
            double[] variablesLine = new double[AMOUNT_OF_VARIABLES_DOT];
            String[] splitline = parseLine(line, AMOUNT_OF_VARIABLES_DOT);
            for (int j = 0; j < AMOUNT_OF_VARIABLES_DOT; j++) {
                try {
                    variablesLine[j] = Double.valueOf(splitline[j]);
                } catch (NumberFormatException e) {
//                    something into logger
                    flag = false;
                }
            }
            if (flag) {
                variables.add(variablesLine);
            }
        }
        return variables.toArray(new double[variables.size()][AMOUNT_OF_VARIABLES_DOT]);
    }

    private String[] parseLine(String string, int amountOfVariables) {
        String spliter = " ";
        return string.split(spliter, amountOfVariables);
    }
}
