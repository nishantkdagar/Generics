package com.javagenerics;

import java.util.Scanner;

public class MaxOfThree {
    public static void largest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        Integer first = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        Integer second = input.nextInt();
        System.out.println("Enter 3rd Number: ");
        Integer third = input.nextInt();
        Integer max = first;
        if (second > max)
            max = second;
        if (third > max)
            max = third;
        System.out.printf("The Maximum of three numbers is: "+ max);
    }

    public static void main(String[] args) {
        MaxOfThree.largest();
    }
}
