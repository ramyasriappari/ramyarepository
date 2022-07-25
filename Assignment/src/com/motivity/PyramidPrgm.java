package com.motivity;
import java.util.*;

public class PyramidPrgm {
        static void pyramid(int n)
        {
            for (int i = n; i >= 1; i--) {
                for (int gap = n - 1; gap >= i; gap--) {
                    System.out.print(" ");
                    System.out.print(" ");
                }
               int num = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print((char)num++ + " ");
                }
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print((char)--num + " ");
                }

                System.out.println("");
            }
        }
        public static void main(String[] args)
        {
            int n = 4;
            pyramid(n);

        }
    }

