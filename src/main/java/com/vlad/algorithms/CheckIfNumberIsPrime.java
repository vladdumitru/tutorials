package com.vlad.algorithms;

import java.util.stream.IntStream;

public class CheckIfNumberIsPrime {
    static Integer numberToCheckForPrime = 55;

    public static void main(String args[]){
        System.out.println("Is it a prime number: "+isPrime(numberToCheckForPrime));
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number%i==0);
    }
}
