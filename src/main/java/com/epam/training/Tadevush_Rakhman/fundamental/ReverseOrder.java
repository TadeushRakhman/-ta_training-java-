package com.epam.training.Tadevush_Rakhman.fundamental;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        System.out.println("write something here : ");
        Scanner input = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer(input.nextLine());
        System.out.println(stringBuffer.reverse());

    }
}






