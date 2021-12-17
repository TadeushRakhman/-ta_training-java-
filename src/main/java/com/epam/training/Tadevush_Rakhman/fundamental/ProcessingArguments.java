package com.epam.training.Tadevush_Rakhman.fundamental;


public class ProcessingArguments {
    public static void main(String[] args) {
        switch (args.length) {
            case 0:
                System.out.println("There are no elements in this array");
                return;
            case 1:
                System.out.println("There is only one element in this array - " + args[0]);
                return;
        }
        long sum = 0;
        long product = 1;
        for (String element : args) {
            sum += Integer.parseInt(element);
            product *= Integer.parseInt(element);
        }
        System.out.println(sum);
        System.out.println(product);

    }
}

