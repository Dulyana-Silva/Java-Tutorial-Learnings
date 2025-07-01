public class Test12 {
    public static void main(String args []){

        //Break Statement
        for (int i = 1; i<= 10; i++){

            if (i==5)
                break;   //If the condition is true, it take out from the For loop
            System.out.println(i); 
            //1 2 3 4 

        }

        //Continue Statement
        for (int a =1; a<= 10; a++){
            if (a==5)
                continue; //If the condition is true, it skips the below line and go to the beginning of the loop
            System.out.println(a);
            //1 2 3 4 6 7 8 9 10
        } 

    }
    
}
