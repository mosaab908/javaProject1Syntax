package org.project;

public class q3 {
    public static void main(String[] args) {
        int[][] num = {
                {5, 6, 4, 3, 8},
                {77, 45, 395, 88, 9},
                {90, 67, 345, 67, 14}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.println(num[i][j]);

                }
            }
        }
    }
}

