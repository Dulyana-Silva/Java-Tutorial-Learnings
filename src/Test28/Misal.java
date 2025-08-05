package Test28;

public class Misal implements Student {   /*To make Misal class inherit the Student interface, 
                                            override all the abstract methods within the interface as public methods   */
    public void eat(){
        System.out.println("Eating");
    }
    public void drink(){
        System.out.println("Drinking");
    }
    public void run(){
        System.out.println("Running");
    }


    public static void main(String[] args) {
        Misal x = new Misal();
        x.drink();
        
        Student y = new Misal(); //Creating an object for the interface through the class 
        System.out.println(y.number); 
    }
    
}
