package com.vlad.resursive;

import java.util.function.Consumer;

import static java.lang.Integer.max;

public class Recursive {

    static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    static int tailSum(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    static int iterativeSum(int n) {
        int sum = 0;
        if(n < 0) {
            return -1;
        }
        for(int i=0; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    static int npower(int n) {
        if (n==0)
            return 1;
        return npower(n-1)*10;
    }

    static Consumer<Integer> consumer = System.out::println;

    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static String toBinary(int n) {
        if (n <= 1 ) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + n % 2;
    }

    static int calculateBinaryTreeHeight(BinaryNode root){
        if (root!= null) {
            if (root.getLeft() != null || root.getRight() != null) {
                return 1 +
                        max(calculateBinaryTreeHeight(root.left),
                                calculateBinaryTreeHeight(root.right));
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        consumer.accept(sum(50));
        System.out.println(tailSum(1, 50));
        System.out.println(iterativeSum(50));
        System.out.println(npower(5));
        System.out.println(fibonacci(5));
        System.out.println(toBinary(6));
        System.out.println(calculateBinaryTreeHeight(new BinaryNode(64)));
    }

    static class BinaryNode {
        int value;
        BinaryNode left;
        BinaryNode right;

        public BinaryNode(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public BinaryNode getLeft() {
            return left;
        }
        public void setLeft(BinaryNode left) {
            this.left = left;
        }
        public BinaryNode getRight() {
            return right;
        }
        public void setRight(BinaryNode right) {
            this.right = right;
        }

    }

}
