package Test26;

public class Student{
        private String name;
        private int age;

        //Creating a Setter ---> assigning a value for the private variable which cannot access from another class
        //Setter are void
        public void setName(String name){
            this.name = name;
        }    


        //Creating a Getter  ---> throught it we can read the private value which we gave via setName
        //Getters are return type
        public String /*String is return data type*/getName(){
            return name;
        }   


        public void setAge(int age){
            this.age = age;
        }

        public int getAge(){
            return age;
        }
  //here we can hide the value from reading it, if we gave getters private instead of public
  //can restrict from setting value through main class, if we give setter private here
    
}