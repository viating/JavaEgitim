package org.example;

// Project Euler Problem-2
public class EvenFibonacciSum {
    public static void main(String[] args) {
        int limit = 4000000; // Dört milyonu aşmayan Fibonacci terimlerini arayacağız
        long sum = 0; // Çift Fibonacci terimlerinin toplamını saklamak için değişken

        int prev = 1;
        int current = 1;

        while (current <= limit) {
            if (current % 2 == 0) {
                sum += current; // Çift terimi toplama ekleyin
            }

            // Fibonacci dizisinde bir sonraki terimi hesaplayın
            int next = prev + current;
            prev = current;
            current = next;
        }

        System.out.println("Dört milyonu aşmayan çift Fibonacci terimlerinin toplamı: " + sum);
    }
}
