package Test30;

class A{
    int x =10;
}


class B extends A{
    int x = 20;
    public void print1(){
        System.out.println(x);
    }
    public void print2(){
        System.out.println(super.x);  //calling for the x in Super Class
    }
}


public class Example1{
    public static void main(String[] args) {
            B obj = new B();
            obj.print1();
            obj.print2();
        }

}