package com.bridge;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int maxNum = 0;
        int previousNumber = 1;
        int nextNumber = 0;

        System.out.println("How many numbers you want in fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Fibonacci Series: ");
        System.out.println(" " + previousNumber);

        for (int i = 2; i <= num; i++) {
            nextNumber = maxNum + previousNumber;
            System.out.println(" " + nextNumber);

            maxNum = previousNumber;
            previousNumber = nextNumber;
        }
    }
}
