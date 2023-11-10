package org.example;

// Project Euler Problem-1
public class Multiple3Or5 {
    static int toplam = 0;

    public static void Sum() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                toplam = toplam + i;
            }
        }
        System.out.println(toplam);
    }

    public static void main(String[] args) {
        Sum();
    }
}
