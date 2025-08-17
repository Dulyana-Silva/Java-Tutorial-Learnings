package Test33;

// Object class is the in-built root class in java
// Within Object class, there are more classes like String, Math etc

class Student{         // Student class is always extented by Object class
    String name;
    int age;

    void run(){
    }
    void eat(){
    }
}


public class Test1 extends Student{
        public static void main(String[] args) {


            // equals method in Object class
            Object o1 = new Object();
            Object o2 = new Object();
            System.out.println(o1.equals(o2));  //false

            Object o3 = new Object();
            Object o4 = o3;
            System.out.println(o3.equals(o4));  //true 
                
            // hashCode method  --> it's an unique code that every obj got.
            System.out.println(o1.hashCode());

            //toString method
            System.out.println(o1.toString());
            System.out.println(o1);    // Both are same, default one also calling for the toString method

            // getClass method
            System.out.println(o2.getClass());   // Object

            Student s1 = new Student();
            System.out.println(s1.getClass());   // Student

            //  notify, notifyAll, wait --> thses methods used in multi-threading
            
        }
}