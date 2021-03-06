package exercises.february;

import java.util.Scanner;

public class FibonacciExtra {

    public static void main(String[] args) {
        intro();
//      iterationOutputDisplay();
        recurrenceOutputDisplay();
    }

    public static void intro() {
        System.out.println("\nWelcome to Fibonacci's sequence calculation :)!");
        System.out.println("\nPlease enter a natural number resembling Fibonacci's sequence's number and get the actual number it stands for: ");
    }

    public static int scanChoice() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    public static void iterationOutputDisplay() {
        System.out.println("Program's calculation result is: " +
                runIterationSum(scanChoice()));
    }

    public static void recurrenceOutputDisplay() {
        System.out.println("Program's calculation result is: " +
//                runRecurrenceSum(scanChoice()));
                runRecurrenceSum1(scanChoice()));
    }

    public static int runIterationSum(int number) {
        int one = 0;
        int two = 1;
        int sum = one + two;

        for (int i = 2; i < number; i++) {
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }

    public static int runRecurrenceSum(int number) {
        if (number > 1) {
            return (runRecurrenceSum(number - 1) + runRecurrenceSum(number - 2));
        } else {
            return number;
        }
    }

    public static int runRecurrenceSum1(int number) {
        return number < 2 ? number : runRecurrenceSum1(number - 1) + runRecurrenceSum1(number - 2);
    }
}