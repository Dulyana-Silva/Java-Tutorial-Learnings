package Test30;

class Student{
    int age;
    String school;
    String email;

    Student(int age, String school, String email){
        this.age = age;
        this.school= school;
        this.email= email;
    }
}

class Misal extends Student{
    int marks;
    Misal(int age, String school, String email, int marks){
        super(age, school, email);
        this.marks = marks;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Misal obj = new Misal(23, "ABCD", "abcd@gmail.com", 60);
        System.out.println(obj.marks);
    }
}
