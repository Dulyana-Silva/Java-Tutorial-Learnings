package Test34;

public class Test2 {
    public static void main(String[] args) {
        
        // converting primitive data types into objects 
        int x =12;
        Integer y = Integer.valueOf(x);  // Boxing, Wrappering
        Integer z = x;  //Auto boxing, Auto wrapping --> default, complier calls vauleOf method


        // wrapper class objects into primitive data types
        Integer a = 3;
        int b = a.intValue();  //Unboxing, Unwrappering
        int c = a;  //Auto unboxing, Auto unwrappering  --> default, complier calls intValue()

    }
}
