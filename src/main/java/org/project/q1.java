package org.project;

public class q1 {
    public static void main(String[] args) {
        int [] days = {44,51,62,69,40,13,29};
        int max = 44;
        int min = 44;

        for(int i : days){
            if (i > max){
                max = i;
            }if (i < min){
                min = i;
            }
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
    }
}
