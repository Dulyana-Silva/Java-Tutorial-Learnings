//Initializing variables from UserInputs using Scanner Class
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {

        // Creating an object with the Scanner class
        Scanner sc = new Scanner(System.in);


        // Variable Declaration with Scanner object

        // For String
        String name = sc.nextLine();
        System.out.println("Name is "+name);
        // For Integer
        int num1 = sc.nextInt();
        System.out.println("Age is "+ num1);
        // For double
        double num2 = sc.nextDouble();
        System.out.println("Height is "+num2);
        // For Character
        char Character = sc.next().charAt(0);
        System.out.println("Character is "+ Character);
        // For Boolean
        boolean bool = sc.nextBoolean();
        System.out.println("Bool is "+bool);
       



    }
}