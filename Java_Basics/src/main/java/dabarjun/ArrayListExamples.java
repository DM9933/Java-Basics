package dabarjun.oop;

import java.util.ArrayList;

public class ArrayListExamples {


    public static void main(String[] args) {

        //array
        int[] numbers = {2,3,4,5,6,7,8};
    //ArrayList<Data Type>name = new ArrayList<DT>();

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);
        System.out.println(names.size());

        names.add("Dabarjun");
        names.add("Jishan");
        names.add("Esrat");
        names.add("Mysha");
        System.out.println(names);
        System.out.println(names.size());

        names.remove(1);
        System.out.println(names);
        System.out.println(names.size());

        for(int i = 0;i < names.size();i++){
            System.out.println(names.get(i));

            names.clear();
            System.out.println(names.size());
            System.out.println(names);
        }

    }
}
