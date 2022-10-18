package com.revature.arrays_demos;

import java.util.Arrays;

public class ArrayDriver {
    public static void main(String[] args) {

        int[] myNumArray = new int[10];

        myNumArray[0] = 74;

        System.out.println(Arrays.toString(myNumArray));

        //System.out.println(myNumArray.toString());

        int[] myArray = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(myArray));

        double balance = 0;

        double[] transactions = {1000, -199.99, 40, -35.43, -150.56};

        //how to i find the balance of the acct?

        //I'd have to find the sum of the values of the array

        for (int i=0; i<transactions.length; i++){
            balance += transactions[i];
        }
        System.out.println("balance: " + balance);

        for (int i=0; i<transactions.length; i++){
            System.out.println(transactions[i]);
        }

        //sort this array

        char[] sizesOfShirts = {'S', 'M', 'L', 'S', 'L', 'X', 'T'};

        int[] sizesAsNumbers = {2, 3, 4, 2, 4, 5, 1};

        Arrays.sort(sizesAsNumbers);

        System.out.println(Arrays.toString(sizesAsNumbers));


    }
}
