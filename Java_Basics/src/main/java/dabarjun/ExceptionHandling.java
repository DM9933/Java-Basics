package dabarjun.oop;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 1st number ");
        int num1 = in.nextInt();
        System.out.println("Please enter 2nd number ");
        int num2 = in.nextInt();

        try{
            int result = num1 / num2;
            System.out.println("Output: "+ result);
        }catch(Exception e){
            System.out.println("You can't divided by zero");
        }
    }
}
