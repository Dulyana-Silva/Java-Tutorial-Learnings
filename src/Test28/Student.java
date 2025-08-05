package Test28;

//In interface you can't have any normal methods(Methods with Implements)
//All the methods within the interface are abstract methods
//It's not possible to create objects within interfaces just same as in abstract class

public interface Student{ //Here also, give the interface name similiarly like in classes
    
int number =10; //In interfaces, all the variables act as they are declared with final kayword... can't do any changes 

    void eat();
    void drink();
    void run();


}