package org.example;

public class SmallestMultiple {
    public static void main(String[] args) {
        long smallestMultiple = findSmallestMultiple(20);
        System.out.println("1 ile 20 arasındaki sayılara kalansız bölünebilen en küçük pozitif sayı: " + smallestMultiple);
    }

    public static long findSmallestMultiple(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = leastCommonMultiple(result, i);
        }
        return result;
    }

    public static long greatestCommonDivisor(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long leastCommonMultiple(long a, long b) {
        return a * (b / greatestCommonDivisor(a, b));
    }
}

