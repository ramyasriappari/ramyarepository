package com.motivity;

import java.util.Scanner;

public class pyramidProgram {

    public static void main(String[] args)
    {

        Scanner ob = new Scanner(System.in);
       System.out.println("Enter the number of rows to print the pattern ");
        int rows = ob.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }

            int x = 1;
            for (int k = 1; k <= i; k++)
            {
                System.out.print(x + " ");
                x = x * (i - k) / (k);
            }
            System.out.println();
        }
    }
}
