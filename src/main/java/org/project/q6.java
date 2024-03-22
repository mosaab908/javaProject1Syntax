package org.project;
//Write a java program to check whether a given number is prime or not?
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number?");
        int num = scanner.nextInt();

        if (num % 2 != 0) {
            System.out.println("the number is prime");
        }else{
            System.out.println("num is not prime");
        }
    }
}