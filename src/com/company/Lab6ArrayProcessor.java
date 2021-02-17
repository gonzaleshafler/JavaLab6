package com.company;

public class Lab6ArrayProcessor implements ArrayProcessor{

    @Override
    public double calculate(double[] array) {
        double result=0;
        for (double element : array) {
            result += element * element;
        }
        return result;
    }

    @Override
    public double calculate(double[][] array) {

        double result=0;
       for (int i=0;i<array.length;i++)
       {
           for (int j=0;j<=i;j++)
           {
               if (array[i][j]>0)
               {
                   result+=array[i][j];
               }
           }
       }
        return result;
    }

    @Override
    public void processArray(double[] array) {
        System.out.println(calculate(array));
    }

    @Override
    public void processArray(double[][] array) {
        System.out.println(calculate(array));
    }
}
