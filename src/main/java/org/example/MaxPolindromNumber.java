package org.example;

public class MaxPolindromNumber {
    public static void main(String[] args) {
        int maxPalindrome = 0;
        int maxI = 0;
        int maxJ = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;
                if (product <= maxPalindrome) {
                    // Palindrom bulduktan sonra devam etmenin bir anlamı yok.
                    break;
                }
                if (isPalindrome(product)) {
                    maxPalindrome = product;
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println("En büyük palindrom: " + maxPalindrome);
        System.out.println("Çarpılan sayılar: " + maxI + " * " + maxJ);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + (number % 10);
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
