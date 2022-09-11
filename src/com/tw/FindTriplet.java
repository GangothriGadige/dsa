package com.tw;

import java.util.Arrays;

public class FindTriplet {
    public static void findTriplet(int[] array, int sum){
        Arrays.sort(array);
        for (int iterator = 0; iterator <= array.length- 1; iterator++) {
            int remainingSum = sum - array[iterator];
            int min = iterator + 1;
            int max = array.length - 1;
            while (min < max) {
                if(array[min]+ array[max]==remainingSum){
                    System.out.println("[" + array[iterator] + ", " + array[min] + ", " + array[max] + "]");
                }
                if (array[min] + array[max] > remainingSum) {
                    max--;
                }
                else {
                    min++;
                }

            }
        }
    }
}


