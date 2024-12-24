package dabarjun;

public class DataTypes {
    public static void main(String[] args) {
        //Primitive Data Type[Int,Double,Float,Char,Boolean]
        // Syntax: variable_type variable_name = variable_value
        int number1 = 10;
        float number2 = 10.55f;
        double number3 = 124566778;
        char letter = 'a';
        boolean bool = true;

        System.out.println("Integer Number " +number1);
        System.out.println("Float Number " +number2);
        System.out.println("Double Number " +number3);
        System.out.println("Char Value " +letter);
        System.out.println("Boolean Value " +bool);

        System.out.println("Integer Number " +number1+ ", Float Number " +number2+", Double Number " +number3);

        // Non-Primitive Data Type[String, Array]
        String name = "Dabarjun";
        int[] number = {0,1,8,8,1,2,8,6,4,3,4};

        System.out.println("Name is " +name+ ", number is " +number[2]);


    }
}
