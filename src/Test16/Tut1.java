public class Tut1 {
        
    int x;
    static int y;

    void meth1(){

    }
    static void meth2(){

    }
    
    public static void main(String args []){
        // x=2;  shows an error, bcoz x is not static
        y=4;
        // meth1(); ---> error, its not a static method
        meth2();

        //To accesss x & meth1 ---> create an object
        Tut1 obj = new Tut1();
        obj.x = 2;
        obj.meth1();



        }
}