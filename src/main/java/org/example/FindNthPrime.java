package org.example;

public class FindNthPrime {
    public static void main(String[] args) {
        int n = 10001; // Bulmak istediğimiz asal sayının sıra numarası
        int count = 0; // Şu ana kadar bulduğumuz asal sayıların sayısı
        int number = 2; // Kontrol edilen sayı

        while (count < n) {
            if (isPrime(number)) {
                count++;
                if (count == n) {
                    System.out.println(n + ". asal sayı: " + number);
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
