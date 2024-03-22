package org.project;
//Write a Java Program to print the first 10 numbers of Fibonacci series.
public class q7 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;


        }
    }
}
