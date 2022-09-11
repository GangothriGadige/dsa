package com.tw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        String[] array1 =str.split(",");
        System.out.println(array1.length);
        int[] array2 =new int[array1.length];
    }
}
