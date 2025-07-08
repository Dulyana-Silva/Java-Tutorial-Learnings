package Test21.Pack1;

public class Kamal {
    public int x =10;  // Since it's Public, this variable can even access from other packages
    protected int y =20;  //Accessialbe only within the Package and Inherit classes
    private int z= 30;   //Accessiable only within the declared class

    public static void main(String[] args) {
        Kamal obj1 = new Kamal();
   
    }
    
}
