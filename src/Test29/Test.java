package Test29;

/*Multipule inheritance is not allowed within java Classes because class can't extends with multiple classes, 
        anyway it's allowed when java Interfaces get involve.
    If it is only java classes, then ONLY Single, Multiple Level & Hierachical Inheritance are allowed. **/

class A{
}
          /*           class B{ }
                       class C extends A, B{ }   ---> Error - Can't inherite multiple classes             */

interface B{
}

interface D{
}

class C extends A implements B {   //Inherite a class and a interface for a class
}

class E implements B, D{  //Inherite interfaces for a class
}  

//Inherite Interfaces for a Interface ---> USE extends KEYWORD
interface F extends B, D{

    
}