package Test35;
    
    //In Generics, we define a common dataType using a symbol within <> , generally we use <T>, it can be String, Integer or anything
    //Now we can use this T as a dataType everywhere in the class

    class A<T>{         //Define the common dataType when class is created                               
        void print(T x){ 
            T y = (T) x;        //Now we don't need to do type casting, so no runtime errors
            System.out.println(y);   
        }
    } 
    public class Test2{
        public static void main(String[] args) {
            A <String> obj1 = new A();
            obj1.print("Hello");   //Hello

            A <Integer> obj2 = new A();
            obj2.print(20);        //20
            
        
        }
    }


