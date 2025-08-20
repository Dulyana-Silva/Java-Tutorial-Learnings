package Test34;
public class Test1 {
        // All Primitive data types have a wrapper class of their own
        // We use them to create object as we cannot create objects from primitive data types
    public static void main(String[] args) {

        // Non-primitive data types like Strings can call the methods within their String class
        String a = "Dulyana";
        System.out.println(a.toLowerCase()); 

    // if we want to do the same for the Primitive data then u hv to create object from Integer Wrapper class
        Integer b = 10;
        Double c = 2.5;
        Boolean d = true;
        System.out.println(b.doubleValue()); //Now u can access Integer wrapper class methods

        //Another way for create an object from Integer Wrapper class
        Integer x = new Integer(20);
        System.out.println(x);  

    // Another advantages in Wrapper Classes is, we can store Null values in variables.
        Integer x1 = null;


    }
}
