package org.example;

public class SumSquareDifference {
    public static void main(String[] args) {
        int n = 100;
        long sumOfSquares = 0;
        long squareOfSum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += (long) i * i;
            squareOfSum += i;
        }
        squareOfSum = squareOfSum * squareOfSum;

        long difference = squareOfSum - sumOfSquares;
        System.out.println("İlk " + n + " doğal sayının karelerinin toplamı ile toplamın karesi arasındaki fark: " + difference);
    }
}
