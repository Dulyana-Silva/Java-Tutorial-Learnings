package Test32;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
        // Exception Handling ---> Here, we're handling the Runtime Errors
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a, b, c;
                
                try{
                    System.out.println("Enter first number :");
                    a = sc.nextInt();
                    System.out.println("Enter second number :");
                    b = sc.nextInt();
                    c = a/b;
                    System.out.println("Answer is :" +c );
                }
                
                catch(ArithmeticException e){
                        System.out.println("Can not divide by zero");
                }

                catch(InputMismatchException e){
                        System.out.println("Please enter an integer");
                }
                catch(Exception e){
                        System.out.println(e);
                }

                finally{
                        System.out.println("Bye!!!");  // With or without exception, any kinda case this will be printed
                }
        }
}