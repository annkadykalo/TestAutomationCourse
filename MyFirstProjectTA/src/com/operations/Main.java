package com.operations;

public class Main {

    public static void main(String[] args) {
        /*
        1) Develop  a program to print numbers from 1 to 10.
        Then update it to print
        - “Five” instead of number 5;
        - number 7 shouldn’t be present in sequence;
         */

        int i = 0;
        do {
            i++;
            if (i == 5){
                System.out.print("Five ");
                continue;
            } else if (i == 7)
                continue;
            System.out.print(i + " ");
        } while (i < 10);

        /*
        1.2. Make the same in backward order starting from 20 to 0
        */
        System.out.println("\n");

        int [] arr = new int [20];
        for (int j = 0; j < arr.length; j++){
            arr[j] = arr.length - j;
            System.out.print(arr[j] + " ");
        }

        System.out.println("\n");

        System.out.println(Power.pow(2, 3));
        System.out.println(Power.pow(10, -2));
        System.out.println(Power.pow(3, 1));
        System.out.println(Power.pow(3, 0));






    }

}
