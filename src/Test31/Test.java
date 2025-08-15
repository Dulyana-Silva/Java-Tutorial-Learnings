package Test31;

import java.util.Scanner;
public class Test{

     //Types of Errors in Java 
            // 1. Syntax Errors    ---> Complier will catch them. We can correct them with the help of complier 
            // 2. Logical Errors  ---> They won't be caught by complier. We have to test the program and check whether we're getting the expected outcome.
            // 3. Runtime Errors   ---> These errors can occur due to it's users mistakes (Divide by 0, Input dismatch)

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a, b, c;

                System.out.println("Enter first number: ");
                a = sc.nextInt();

                System.out.println("Enter second number: ");
                b = sc.nextInt();

                c = a/b;
                System.out.println("Answer is "+ c );
            


        }
           
            
}