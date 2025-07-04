public class Tut2 {

    String name;

    void call(){
        System.out.println("Take a call from "+ name);
    }

//If there're 10 phones then, you have to create 10 variables and 10 methods, 
//but if you're using Objects then all you have to create is, a 1 variable and 1 object
    static String name1;
    static String name2;
    static String name3;

    static void call1(){
        System.out.println("Take a call from "+ name1);
    }

    static void call2(){
        System.out.println("Take a call from "+ name2);
    }

    static void call3(){
        System.out.println("Take a call from "+ name3);
    }


    public static void main(String args[]){
            name1 ="Nokia";
            name2 = "Sumsung";
            name3 = "Huawei";
            call1();
            call2();
            call3();


    //Creating Phone Objects
        Tut2 Phone1 = new Tut2();
        Tut2 Phone2 = new Tut2();
        Tut2 Phone3 = new Tut2();

        Phone1.name= "Nokia";
        Phone2.name= "Sumsung";
        Phone3.name= "Huawei";

        Phone1.call();
        Phone2.call();
        Phone3.call();


    }
    
}
