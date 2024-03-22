package org.project;
//Create a 2D array of integers. Develop a program which will calculate the sum of
//// even and odd numbers for that array.
public class q4 {
    public static void main(String[] args) {
        int[][] num = {{12, 24, 35, 67, 88},
                {99, 30, 55, 999, 14},
                {16, 111, 4532, 56, 89}};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (num[i][j] % 2 == 0) {
                    evenSum += num[i][j];
                }
                if (num[i][j] % 2 != 0) {
                    oddSum += num[i][j];
                }
            }
        }

        System.out.println("even sum is: " + evenSum);
        System.out.println("odd sum is: " + oddSum);
    }
}
