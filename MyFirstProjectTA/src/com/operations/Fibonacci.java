package com.operations;

import java.util.Arrays;

public class Fibonacci {
    public static int[] getFibonacciSequence(int n){
        int [] arr = new int [n];

        arr[0] = 0;
        if (n == 1)
            return arr;
        arr[1] = 1;
        if (n == 2)
            return arr;

        for (int i = 2; i < n ; i++){
            arr[i] = arr[i-1] + arr[i-2]; //this comment is for creating merge conflict
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Fibonacci.getFibonacciSequence(1)));
        System.out.println(Arrays.toString(Fibonacci.getFibonacciSequence(9)));

    }
}
