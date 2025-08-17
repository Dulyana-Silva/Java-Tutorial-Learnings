package Test33;

// Object class is the in-built root class in java
// Within Object class, there are more classes like String, Math etc

class Student{         // Student class is always extented by Object class
    String name;
    int age;

    void run(){

    }
    void eat(){
        System.out.println("Eatting");
    }
}


public class Test1 extends Student{
        public static void main(String[] args) {
            Test obj = new Test();
            obj.eat();    // From Extented Students class
            obj.clone();  // These're from Object class
        
            Student s = new Student();    // Student class also have a another parent class, it's the Object class

            Object o = new Object();
        }
}