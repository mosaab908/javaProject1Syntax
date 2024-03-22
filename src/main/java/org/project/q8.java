package org.project;
//Maximum and minimum number in the array?
public class q8 {
    public static void main(String[] args) {
        int [] num = {22,44,34,76,100,35,78,1000,1};
        int max=0;
        int min=1000;
        for(int i=0; i < num.length; i++){
            if (num[i]>max){
                max = num[i];
            }if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("max number is "+ max+" and min number is "+ min);
    }
}
