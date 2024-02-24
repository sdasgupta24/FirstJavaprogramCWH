package com.company;

public class CWH_34_Recursion {
    static int factorial(int n) {      // quick quiz
        // factorial(n) = n*(n-1)*...*1
        // or factorial(n) = n*factorial(n-1)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int prod = 1;
            for (int i = 1; i <= n; i++) {
                prod *= i;
            }
            return prod;
        }

    }

    static int fibonacci(int N) {
        if (N == 1) {
            return 0;
        }
        if (N == 2 || N == 3) {
            return 1;
        }
            return fibonacci(N - 2) + fibonacci(N - 1);
    }

    public static void main(String[] args) {
        int x = 4;
        int number = 10;
        System.out.println("The value of factorial n is : " + factorial(x));
        System.out.println("The value of factorial n is : " + factorial_iterative(x));
        System.out.println("Fibonacci Series of " + number + " numbers: ");
        for (int i=1;i<=number;i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
