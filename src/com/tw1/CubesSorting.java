package com.tw1;

public class CubesSorting {
    public static void sortCubes(int size, int[] array){
        if(descending(array)==true){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
    public static boolean descending(int[] array){
        boolean result=true;
        int iterator;
        for(iterator=0;iterator< array.length-1;iterator++){
            if(array[iterator]<=array[iterator+1]){
                result=false;
                break;
            }
        }
        return result;
    }

}
