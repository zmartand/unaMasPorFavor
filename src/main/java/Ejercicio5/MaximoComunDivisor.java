package Ejercicio5;

import java.util.function.IntUnaryOperator;

import java.util.function.BiFunction;

public class MaximoComunDivisor {
    public static int gcdRecursive(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcdRecursive(n, m % n);
        }
    }

    public static int gcdIterative(int m, int n) {
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public static BiFunction<Integer, Integer, Integer> gcdLambda = (m, n) -> n == 0 ? m : gcdLambda.apply(n, m % n);

    public static void main(String[] args) {
        int m = 24;
        int n = 36;

        int gcd1 = gcdRecursive(m, n);
        int gcd2 = gcdIterative(m, n);
        int gcd3 = gcdLambda.apply(m, n);

        System.out.println("m = " + m + ", n = " + n);
        System.out.println("GCD (recursive) = " + gcd1);
        System.out.println("GCD (iterative) = " + gcd2);
        System.out.println("GCD (lambda) = " + gcd3);
    }
}


