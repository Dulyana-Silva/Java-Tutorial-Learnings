package Test23;

public class Child extends Parent{
    public void phone(){
        System.out.println("nokia");  //this method overrides the extended one from the parent
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.phone();
    }
}
