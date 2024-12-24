package dabarjun;

import java.sql.SQLOutput;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Your Name is " +name);

        System.out.println("Enter Your Age: ");
        int age = input.nextInt();
        System.out.println("Your Age is " +age);




    }
}
