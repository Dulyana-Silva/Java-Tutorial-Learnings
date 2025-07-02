public class Phone {

        String name;
        String color;
        int ram;

        public void call(){
                System.out.println("Take call from "+ name);
        }
        
        public void browserInternet() {
                System.out.println("Browse Internet");
        }


        public static void main(String args[]){
            
        //This is an OOP concept, Here, we create objects
        //Through objects we can access methods and attributes in the Phone class multiple times without re-wirting them
                Phone phone1 = new Phone();
                phone1.name = "sumsung";
                phone1.color = "black";
                phone1.call();
                System.out.println(phone1.color);

                Phone phone2 = new Phone();
                phone2.name ="nokia";
                phone2.call();
        }

    
}
