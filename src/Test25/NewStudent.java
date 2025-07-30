package Test25;
//Using this Keyword
public class NewStudent{
    String name;
    int age;

    NewStudent(String name, int age){
        //name = name;   --> null   if we wrote without "this", java recognized both "name"as the one received from the constructor
        //age = age;     --> 0

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        NewStudent obj = new NewStudent("Dulyana", 23);
        System.out.println(obj.name);   
        System.out.println(obj.age);   
    }

}