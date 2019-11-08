package com.verisign.tests;

import java.util.*;
import java.util.stream.Collectors;

public class Comcast {
    public static void main(String[] args) {
//        char[] array1 = {'b', 'a', 'c'};
//        char[] array2 = {'a', 'b', 'c'};
//
//        System.out.println(Arrays.equals(array1, array2));


        List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);
        Set square = number.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println("square = " + square);
        System.out.println();

        number.stream().map(x->x*x).forEach(y->System.out.println(y));






    }
}
