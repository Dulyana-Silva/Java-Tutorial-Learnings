package Test18;

public class Bank {

    int rupees;
    Bank(){
        rupees=0;
    }
    Bank(int x){
        rupees= x;
    }
    //Bank(int x,int y) {}
    //Bank(String z)  {}
 
    public static void main(String[] args) {
        Bank Nimal= new Bank();
        Bank Kamal = new Bank(2000);

        System.out.println(Kamal.rupees);
        System.out.println(Nimal.rupees);

    }

}
