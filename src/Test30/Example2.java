package Test30;

class A{
    void show(){
        System.out.println("Hi");
    }
}

class B extends A{
    void show(){
        super.show();
        System.out.println("Hello");
    }
}

public class Example2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
