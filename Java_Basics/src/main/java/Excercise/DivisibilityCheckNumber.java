package Excercise;

import java.util.Scanner;

public class DivisibilityCheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user-defined range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Numbers not divisible by 2 or 3 in the range:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
