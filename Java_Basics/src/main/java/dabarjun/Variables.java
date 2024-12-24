package dabarjun;

public class Variables {

    static int globalvariable = 100;
    String instanceVariable = "Hello";

    public static void main(String[] args) {
        // Variables
        int localvariable = 200;
        System.out.println("This is a Local variable = " +localvariable);
        // here num is declared as a global variable
        // so i can not access that directly,
        // so i have to use static variable.

        System.out.println("This is Global variable = "+globalvariable);

        //Object Declaration
        //Syntax: ClassName objectName = new ClassName()
        Variables obj = new Variables();
        System.out.println("This is Instance Variable = "+obj.instanceVariable);


    }
}
