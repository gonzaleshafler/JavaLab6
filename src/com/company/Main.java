package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();


    }

    private void run() {
        Lab6ArrayProcessor lab6ArrayProcessor=new Lab6ArrayProcessor();
        Lab6ArrayReader lab6ArrayReader=new Lab6ArrayReader();
        double[] arr=lab6ArrayReader.readOneDimensionalArray("anotherfile1.txt");
        System.out.println(lab6ArrayProcessor.calculate(arr));
    }
}
