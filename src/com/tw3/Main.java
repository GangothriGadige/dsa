package com.tw3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void getMax(int size, int[] array){
            Arrays.sort(array);
            int max = array[size- 1];
            int min = array[0];
            System.out.println(max-min);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int testCases = scanner.nextInt();
            for (int iterator = 0; iterator < testCases; iterator++) {
                int size = scanner.nextInt();
                scanner.nextLine();
                String string = scanner.nextLine();
                String[] array1 = string.split(" ");
                int[] array2 = new int[array1.length];
                for (int i = 0; i < array1.length; i++) {
                    array2[i] = Integer.parseInt(array1[i]);
                }
                getMax(size, array2);
            }
        }
    }

