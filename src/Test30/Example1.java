package Test30;

class A{
    int x = 10;
}

class B extends A{
    int x =20;
    public void print(){
        System.out.println(super.x);
    }
}

public class Example1 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.x);
        obj.print();
    }
}
