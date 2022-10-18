package com.revature.testing;

public class GetIndex {
    /*
     Create an array of 5 numbers, please retrieve the first and last index and add them
     */

    public static int findIndex(int[] arr){

        int y = 0;

        int i = arr[0];

        int j = arr[arr.length -1];

        y = i + j;

        return y;
    }
}
