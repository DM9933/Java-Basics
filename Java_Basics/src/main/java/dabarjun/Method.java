package dabarjun;

public class Method {

    public static void sum(int a, int b){
        System.out.println("Sum is "+(a+b));
    }
    public static void sum(int a, int b, int c){
        System.out.println("Sum is "+(a+b+c));
    }

    public  void mul(int a, int b, int c, int d){
        System.out.println("Sum is "+(a*b*c*d));
    }

    //In the Non-static Method we can access everything
    // but in static Method if we need to access anything
    // then we can easily access static value,
    // but we can't access non-static value,then we have to use Object

    static int x =10;
    int y = 20;

    public void case1(){
        System.out.println(x+y);
    }

    public static void case2(){
        Method obj1 = new Method();
        System.out.println(x+obj1.y);
    }



    public static void main(String[] args) {
        sum(10,20);
        sum(20,30);
        sum(30,40);
        sum(40,50,600);

        Method obj = new Method();
        obj.mul(30,40,50,60);
        System.out.println("This is Case 1");
        obj.case1();
        System.out.println("This is Case 2");
        case2();

    }
}
