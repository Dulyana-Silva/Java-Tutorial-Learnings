package Test27;

/*final*/public class Test { // if stated final won't be able to inherit from this class
    /*final*/public void say(){ // if stated final won't be able to access from the child class
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        final double g = 9.81;    //this variable cannot be changed, it will be a constant forever
//        g=10; //if try to change it will occur an error
        System.out.println(g);
    }
}