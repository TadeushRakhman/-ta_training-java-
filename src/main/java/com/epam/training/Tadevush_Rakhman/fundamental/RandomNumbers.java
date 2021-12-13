package com.epam.training.Tadevush_Rakhman.fundamental;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers do you want to print?: ");
        int number = scanner.nextInt();
        Random random = new Random();

        for (int a = 0; a < number; ++a) {
            System.out.println(random.nextInt());
        }
        for (int a = 0; a < number; ++a) {
            System.out.print(" " + random.nextInt());
        }
    }
}
