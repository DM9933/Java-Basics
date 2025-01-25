package dabarjun.oop;

import java.util.Scanner;

public class MathodOverloading {

    public static void sum(int a, int b){
        System.out.println("Sum: "+(a+b));
    }

    public static void sum(int a, int b, int c){
        System.out.println("Sum: "+(a+b+c));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Sum of two or three numbers: ");
                sum(in.nextInt(), in.nextInt());
                sum(in.nextInt(), in.nextInt(),in.nextInt());

    }
}
