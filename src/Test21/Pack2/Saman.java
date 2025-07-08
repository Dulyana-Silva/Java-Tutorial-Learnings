package Test21.Pack2;

import Test21.Pack1.*;   //Import all class from pack1

public class Saman extends Kamal {
    public static void main(String[] args) {
        Kamal obj3 = new Kamal();
        System.out.println(obj3.x);

        //Since Saman inherits from Kamal ---> Throught Saman's object we can access the protected variable in Kamal 
        Saman obj4 = new Saman();
        System.out.println(obj4.y);
    }
}
