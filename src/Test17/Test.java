package Test17;

public class Test {
        String name1;
        String name2;

    // The constructor method has the same name as the class
    // It has no return type
    // It will be automatically called when an object is created

       Test(){
            name2 ="Mishel";
            System.out.println("World");
       }
       
       void meth(){
            System.out.println("Hello");
       }
       
    public static void main(String[] args) {
        Test obj = new Test();     //World
        //when creating the Object, constructor method will be called, So it will be appearing in the terminal
        obj.meth();  //Hello
        System.out.println(obj.name1);   //null
        System.out.println(obj.name2);   //Mishel

    }
    
}
