public class Test14 {
    public static void main(String args []){

        String str1 = "Hello World";

        System.out.println(str1.length());   //counts white spaces too
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());


    //Concatenation --> concat()
        String s1= "Hiii";
        String s2 = "There!!!";

        System.out.println(s1 + " "+ s2);
        System.out.println(s1.concat(" ").concat(s2));   

    
    //Checking whether the String is Empty or Not

        String s3 ="";
        String s4= " ";

        System.out.println(s1.isEmpty());  //false
        System.out.println(s3.isEmpty());  //true
        System.out.println(s4.isEmpty());  //false  Here, whitespace also count as a String

    //Replace the given String
        String str2= "Hello World";

        System.out.println(str2.replace("World", "there"));  //Hello there
        System.out.println(str2.replace("o", "*"));          //Hell* W*rld
        System.out.println(str2.replaceFirst("o", "*"));      //Hell* World

    
    //Check whether Contains
    System.out.println(str2.contains("llo"));  //true
         

    }
    
}
