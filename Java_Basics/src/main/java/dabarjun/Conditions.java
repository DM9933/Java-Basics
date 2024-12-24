package dabarjun;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*
        System.out.println("Enter 1st number:");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = in.nextInt();

        if(num1>num2){
            System.out.println(num1+ " is greater than " +num2+ " then Subtraction is " +(num1-num2));
        } else if (num1<num2) {
            System.out.println(num1+ " is less than " +num2+ " then Summation is " +(num1+num2));
        } else{
            System.out.println(num1+ " is equal to " +num2+ " then Multiplication is " +(num1*num2));
        }

         */
        /*
        System.out.println("Enter a Text: ");
        String text =  in.nextLine();
        if(text.equalsIgnoreCase("Dabarjun")){
            System.out.println("Your Text is Dabarjun");
        }

         */
        System.out.println("Enter a Text: ");
        String text = in.nextLine();
        switch(text){
            case "Animal":
                System.out.println("Animal");
                break;
            case "Book":
                System.out.println("Book");
                break;
            default:
                System.out.println("Unknown Text");
        }
    }
}
