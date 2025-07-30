package Test24;

public class Misal extends Nimal {
        void drink(){
            System.out.println("Drinking");
        }
        void run(){
            System.out.println("Running");     //re-create the abstract method in nimal here again as a normal one, 
        }                                        //so that here's will override the extended one

        public static void main(String[] args) {
            Misal obj1 = new Misal();
            obj1.drink();
            obj1.run();
            obj1.eat();
        }
}
