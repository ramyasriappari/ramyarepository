package com.motivity;

import java.util.Arrays;
public class ArraySorting
{
    public static int[] sortByBits(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] % 10001;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int arr2[] = sortByBits(arr);
        for (int i:arr2
        ) {
            System.out.print(i+" ");
        }
    }
}




