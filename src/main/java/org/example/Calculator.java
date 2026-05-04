package org.example;

public class Calculator {
    // Add a static function called add that takes two int parameters and returns their sum (as an int)
    public static int add(int a, int b){
        return a + b;
    }

    // Add a static function called subtract that takes two int parameters and returns their difference (as an int)
    public static int subtract(int a, int b){
        return a - b;
    }
    // Add a static function called multiply that takes two int parameters and returns their product (as an int)
    public static int multiply(int a, int b){
        return a * b;
    }
    // Add a static function called divide that takes two int parameters and returns their quotient (as an int)

    public static int divide(int a, int b){
        return a / b;
    }

    //testing locally.
    public static void main(String[] args) {
        System.out.println(Calculator.add(1, 2));
        System.out.println(Calculator.subtract(1, 2));
        System.out.println(Calculator.multiply(1, 2));
        System.out.println(Calculator.divide(8, 2));
    }
}
