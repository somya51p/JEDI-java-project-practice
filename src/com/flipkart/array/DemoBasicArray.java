package com.flipkart.array;

public class DemoBasicArray {
    public static void main(String[] args) {
        // there are three types of array
        // Single / Multiple / Custom

        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 60;

        // print array
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
