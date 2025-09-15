package Test35;

class A{
    void print(String x){
        System.out.println(x);
    }
}

class B{
    void print(int x){
        System.out.println(x);
    }
}
public class Test{
    public static void main(String [] args){
        A obj1 = new A();
        obj1.print("Hello");

        B obj2 =  new B();
        obj2.print(20);

        //here both method names are same, only the data type of the passing arguments are different
        //Using Generics in Java, we can get this same task done by only making one method
    }
}