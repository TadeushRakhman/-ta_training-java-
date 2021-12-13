package com.epam.training.Tadevush_Rakhman.fundamental;

import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args) {
        System.out.print("Enter the month number: ");
        System.out.println(monthNameByMonthNumber(new Scanner(System.in).nextInt()));
    }

    private static String monthNameByMonthNumber(int monthNumber) {
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"};
        if (monthNumber > 0 && monthNumber <= months.length)
            return months[monthNumber - 1];
        else
            return "this month doesn't exist";

    }
}
