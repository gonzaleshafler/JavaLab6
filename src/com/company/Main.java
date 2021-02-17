package com.company;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();


    }

    private void run() {
        Lab6ArrayProcessor lab6ArrayProcessor=new Lab6ArrayProcessor();
        Lab6ArrayReader lab6ArrayReader=new Lab6ArrayReader();

        double[] arr=lab6ArrayReader.readOneDimensionalArray("anotherfile1.txt");
        double[][]arr3=lab6ArrayReader.readTwoDimensionalArray("anotherfile.txt");

        File file=new File("anotherfile1.txt");
        double[] arr2=lab6ArrayReader.readOneDimensionalArray(file);
        System.out.println("Array: "+ Arrays.toString(arr)+" Res: "+lab6ArrayProcessor.calculate(arr)+"\n"+"Array: "+ Arrays.toString(arr2)+" Res: "+lab6ArrayProcessor.calculate(arr2)+"\n Array[2]res:"+lab6ArrayProcessor.calculate(arr3));


        lab6ArrayProcessor.processArray(arr3);
        lab6ArrayProcessor.processArray(arr);

    }
}
