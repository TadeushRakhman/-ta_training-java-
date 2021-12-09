package com.epam.training.Tadevush_Rakhman.fundamental;

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        System.out.println("Write your name: ");
        System.out.println("Hello, " + new Scanner(System.in).nextLine());
    }
}
