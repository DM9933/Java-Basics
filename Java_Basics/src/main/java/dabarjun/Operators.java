package dabarjun;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1 = op.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = op.nextInt();

        System.out.println("Summation is = " + (num1 + num2));
        System.out.println("Subtraction is = " + (num1 - num2));
        System.out.println("Multiplication is = " + (num1 * num2));
        System.out.println("Division is = " + (num1 / num2));
        System.out.println("Module is = " + (num1 % num2));
    }
}
