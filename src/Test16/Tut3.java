public class Tut3 {
    
    //without declaring variables separately ---> Passing the variable value directly to the method
    void call(String name){
        System.out.println("Take a call from "+ name );
    }


    public static void main(String args[]){
        Tut3 Phone1 = new Tut3();
        Tut3 Phone2 = new Tut3();

        Phone1.call("Nokia");
        Phone2.call("Sumsung");

    }
}
