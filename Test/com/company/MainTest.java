package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest
{
        Lab6ArrayProcessor testProcessor;
        Lab6ArrayReader testReader;
        @BeforeEach
        void setUp() {
                testProcessor = new Lab6ArrayProcessor();
                testReader=new Lab6ArrayReader();
        }
        @Test
        void testCalc1() {
                double[] array = {5, 1, 2, 1, -1, -2, -1, 10, 1, 5, 2, -3};
                double result = testProcessor.calculate(array);
                double expected = 176;
                assertEquals(expected, result, "Error");
        }
        @Test
        void testCalc2() {
                double[][] array = {
                        {1, 116, -431, -210, -205, -353},
                        {-1, 1, 140, -15, 460, -397},
                        {-1, 1, -1, -31, -178, -146},
                        {1, 1, 2, -1, -373, 235},
                        {-1, -2, 1, 1, 1, -497},
                        {1, 1, -1, 1, 1, 1}
                };
                double result = testProcessor.calculate(array);
                double expected = 15;
                assertEquals(expected, result, "Result not correct.");
        }
        @Test
        void readOneDimArray() {
                File file = new File("1DArray.txt");
                double[] numbers = testReader.readOneDimensionalArray(file);
                double[] expected = {12, 5, 64, 2, 3, 42, -5};
                assertArrayEquals(expected, numbers, "Arrays not equals.");
        }

        @Test
        void testReadOneDimArray() {
                double[] numbers = testReader.readOneDimensionalArray("1DArray2.txt");
                double[] expected = {5, 36, 45, 63, 253, -34, -75, 2, 46, 232, 653, -333};
                assertArrayEquals(expected, numbers, "Arrays not equals.");
        }

        @Test
        void readTwoDimArray() {
                File file = new File("2DArray.txt");
                double[][] numbers = testReader.readTwoDimensionalArray(file);
                double[][] expected = {
                        {-475, -384, -130, 87, 7},
                        {209, -483, -439, 101, 32},
                        {-100, -457, -473, 348, -482},
                        {-297, -164, 322, -357, 238},
                        {-383, -437, -182, 159, -274}
                };
                assertArrayEquals(expected, numbers, "Arrays not equals.");
        }

        @Test
        void testReadTwoDimArray() {
                double[][] numbers = testReader.readTwoDimensionalArray("2DArray21.txt");
                double[][] expected = {
                        {166, 116, -431, -210, -205, -353},
                        {-281, 22, 140, -15, 460, -397},
                        {-203, 352, -225, -31, -178, -146},
                        {140, 174, 7, -276, -373, 235},
                        {-169, -39, 335, 459, 120, -497},
                        {376, 84, -109, 190, 193, 135}
                };
                assertArrayEquals(expected, numbers, "Arrays not equals.");
        }
}