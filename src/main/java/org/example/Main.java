package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");}

    public static String[]  DIGIT_NAMES = {
            "Zero",
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",

    };

    public static boolean isPalindrome(int number) {

        String numberStr = Integer.toString(Math.abs(number));

        String reverseNumber = new StringBuilder(numberStr).reverse().toString();

        return numberStr.equals(reverseNumber);
    }

    public static boolean isPerfectNumber(int number) {

        int total = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0)
                total += i;

        }

        return total == number;

    }

    public static String numberToWords(int number) {

        if (number < 0)
            return "Invalid Value";

        String numberStr = Integer.toString(number);

        String[] digits = new String[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {

            char digit = numberStr.charAt(i);

            int x = Integer.parseInt(Character.toString(digit));

            String digitStr = DIGIT_NAMES[x];

            digits[i] = digitStr;


        }
        return String.join(" ", digits);
    }
}
