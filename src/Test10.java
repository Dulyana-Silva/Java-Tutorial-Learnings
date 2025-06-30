public class Test10 {
    public static void main (String args []){
         
    //One Dimensional Array 
        int [] Numbers = {2,4,6,8};
        String [] Names = {"Sunil", "Nimal", "Pawan"};

        System.out.println(Names[1]);  //Nimal
        /*System.out.println(Names[4]);  //error   Since there's no 4th element exist   **/

        //Once you created an array in above way, we can't add further elements to it
        //If we want to do it, then 1st we have to specify the array length at the beginning

        String [] Fruits = new String [5];
        Fruits[0] ="Apple";
        Fruits[1] ="Papaya";
        System.out.println(Fruits[0]); //Apple
        System.out.println(Fruits[4]); //Instead of getting an error it will display NULL
        Fruits[4]= "Banana";
        System.out.println(Fruits[4]); //Banana


    //Two Dimensional Array 
        int [][] x= {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                                     };
        System.out.println(x[1][0]); //4

    }
    
}
