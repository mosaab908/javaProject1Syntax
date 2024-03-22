package org.project;
//Write a program to swap 2 numbers without a temporary variable?
public class q5 {
    public static void main(String[] args) {
        int num1=23;
        int num2=12;
        System.out.println("Before swapping number 1 = "+num1+" and number two = "+num2);
        num1=num1-num2;
        num2=num1+num2;
        num1=num2-num1;


        System.out.println("After swapping number 1 = "+num1+" and number two = "+num2);
    }
}
