package org.example;

// Project Euler Problem-3
public class PrimeFactor {
    public static void main(String[] args){
        long number = 600851475143L;

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}
