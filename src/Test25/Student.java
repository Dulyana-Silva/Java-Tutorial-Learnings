package Test25;
//Without this Keyword
public class Student {
    String name;
    int age;

    Student(String x, int y){
        name = x;
        age = y;
    }

    public static void main(String[] args) {
        Student obj = new Student("Dulyana", 23);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

}