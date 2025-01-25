package dabarjun.oop;

public class Father extends Grandfather {
    static String car = "Toyota";
    static double balance = 20000000;
    int age = 55;

    public static void info(){
        System.out.println("Fathers car is: "+car);
        System.out.println("Fathers balance is: "+balance);
    }
}
