public class Test13 {
    public static void main(String args []){

        //Ways to create a String Variables
//1    
        String s1 = "Hello World";
        String s2 = "Hello World";
        //In this Initialization way, since the both values are equal they will share the memory location

        if (s1 == s2){
            System.out.println("Yes");}
        else {                                //Yes
            System.out.println("No");}
        

//2
        String s3= new String("Hello World");
        String s4= new String("Hello World");

        //Here, java allocates separate memory locations to both variables

        if (s1 == s2){
            System.out.println("Yes");}                                  
        else {                                     //No
            System.out.println("No");}                                                     
 
            
//3  ----> Using char Array

        char [] x = {'j','a','v','a'};
        String str = new String(x);
        System.out.println(str);

    }
    
}
