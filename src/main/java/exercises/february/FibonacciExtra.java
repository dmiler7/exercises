package exercises.february;

import java.util.Scanner;

public class FibonacciExtra {

    public static void main(String[] args) {
        intro();
        outputDisplay();
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

    public static void outputDisplay() {
        System.out.println("Program's calculation result is: " +
                runRecurrenceSum(scanChoice()));
    }

    public static int runRecurrenceSum(int number) {
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
}