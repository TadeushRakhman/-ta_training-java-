package com.epam.training.Tadevush_Rakhman.fundamental;

import java.util.Scanner;

public class ProcessingArguments {
    public static void main(String[] args) {
        System.out.println("Enter two integers to find out their sum and product: ");
        Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println("Sum = " + (a + b));
            System.out.println("Product = " + (a * b));



    }
}
