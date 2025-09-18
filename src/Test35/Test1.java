package Test35;

//First, we are trying to get done the task using Object class

//Object class is the Parent of all the in-build classes in java and our created classes
//It's the TOP class in java hierachy, So every dataType is under this Object Class

class A{                                        
    void print(Object x){    //if we're going to store the values of the passed object in a variable then everytime we have to do type casting   
                             //but when doing this we might get runtime errors, which are even hard to identify, therefore our solution is Generics
        // Double y = (Double)x;     //Type Casting
        // String y = (String)x;     //Type Casting

        System.out.println(x);   
    }
}

public class Test1{
    public static void main(String [] args){
        A obj1 = new A();
        obj1.print("Hello");   //Hello
        obj1.print("20");      //20
        obj1.print("20.223");  //20.223




    }
}