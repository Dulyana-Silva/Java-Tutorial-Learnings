package Test24;
// Abstract classes contain at least one abstract method which is an empty method with no implementation
// Also there can be methods with implementations too
// Objects cannot be created for abstract classes
// For another class to inherit from it a value must be assigned to that abstract method in the subclass using overriding

abstract public class Nimal {
        abstract void run();   
    
        void eat(){
            System.out.println("Eating");
        }
        public static void main(String[] args) {
            //if we create an object here, it will give errors
        }
}