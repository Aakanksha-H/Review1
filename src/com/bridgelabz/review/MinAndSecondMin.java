package com.bridgelabz.review;

public class MinAndSecondMin {
    public static void main(String[] args) {
      int arry[] = {4,45,41,7,1,5};
        int min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (min > arry[i]) {
                min = arry[i];
            }
        }
        System.out.println("Min number in arry is " + min);

        int secondMin = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] < secondMin && arry[i] > min ) {
                secondMin = arry[i];
            }
        }
        System.out.println("Second min number in arry is " + secondMin);
    }
}