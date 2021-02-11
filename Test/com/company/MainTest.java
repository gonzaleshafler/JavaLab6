package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
        Lab6ArrayReader testReader;
        Lab6ArrayProcessor testProcessor;

        @BeforeEach
        void  setUp()
        {
                testReader=new Lab6ArrayReader();
                testProcessor=new Lab6ArrayProcessor();
        }
        @Test
        void someTest() {

                double[] arr=testReader.readOneDimensionalArray("anotherfile1.txt");

                double expected =42;
                double rez=testProcessor.calculate(arr);
                assertEquals(expected,rez,0.001);
        }
        @Test
        void anotherTest()
        {
                double[][] arr=testReader.readTwoDimensionalArray("anotherfile.txt");

                double expected =36;
                double rez=testProcessor.calculate(arr);
                assertEquals(expected,rez,0.001);
        }

}