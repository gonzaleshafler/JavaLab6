package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Lab6ArrayReader implements DoubleArrayReader {

    @Override
    public double[] readOneDimensionalArray(File file) {
        try (Scanner reader = new Scanner(file)) {
            int n = reader.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = reader.nextDouble();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }

    }
    @Override
    public double[] readOneDimensionalArray(String fileName) {

        try (BufferedReader reader= Files.newBufferedReader(Paths.get(fileName)))
        {
            int n = Integer.parseInt(reader.readLine());
            double[] arr = new double[n];
            String s=reader.readLine();
            String sArr[]=s.trim().split("\\s+");
            for (int i=0;i<n;i++)
            {
                arr[i]=Double.parseDouble(sArr[i]);
            }
            return arr;
        }
        catch (IOException ex)
        {
            System.err.println("Error reading file");
            return null;
        }
    }

    @Override
    public double[][] readTwoDimensionalArray(File file) {
        try (Scanner reader= new Scanner(file)) {
            int n= reader.nextInt();
            double[][] arr = new double[n][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j=0;j< arr[i].length;j++)
                {
                    arr[i][j]=reader.nextDouble();
                }
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }

    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
        try (Scanner reader= new Scanner(new File(fileName))) {
            int n= reader.nextInt();
            double[][] arr = new double[n][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j=0;j< arr[i].length;j++)
                {
                    arr[i][j]=reader.nextDouble();
                }
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }


}
