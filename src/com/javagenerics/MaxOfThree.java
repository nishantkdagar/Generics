package com.javagenerics;

import java.util.*;

class Compare<T extends Comparable<T>>{

    public T large(){

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 1st Value: ");
        T first = (T) inp.next();
        System.out.println("Enter 2nd Value: ");
        T second = (T) inp.next();
        System.out.println("Enter 3rd Value: ");
        T third = (T) inp.next();


        T max = first;
        if (second.compareTo(max)>0)
            max = second;
        if (third.compareTo(max)>0)
            max = third;
        //System.out.printf("The Maximum of three numbers is: "+ max);
        return max;
    }

}
public class MaxOfThree {
    public static void main(String[] args) {
        Compare<Integer> largeint = new Compare<Integer>();
        System.out.println("Largest Integer is: "+largeint.large());
        Compare<Double> largefloat = new Compare<Double>();
        System.out.println("Largest Float is: "+largefloat.large());
        Compare<String> largestring = new Compare<String>();
        System.out.println("Largest String is: "+largestring.large());
    }
}
