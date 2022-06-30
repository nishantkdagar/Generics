package com.javagenerics;

import java.util.Scanner;

public class MaxOfThree {
    public static void largest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        Double first = input.nextDouble();
        System.out.println("Enter 2nd Number: ");
        Double second = input.nextDouble();
        System.out.println("Enter 3rd Number: ");
        Double third = input.nextDouble();
        Double max = first;
        if (second.compareTo(max)>0)
            max = second;
        if (third.compareTo(max)>0)
            max = third;
        System.out.printf("The Maximum of three numbers is: "+ max);
    }

    public static void main(String[] args) {

        MaxOfThree.largest();
    }
}
