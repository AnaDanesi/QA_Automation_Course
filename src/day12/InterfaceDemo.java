package day12;
/*Data Abstraction

Interface
-------------
Abstraction is a process of hiding the implementation details
and showing only functionality to the user.

Interface
-------------
An interface is a blueprint of class.
Interface contains final & Static variables by default.
Interface contains abstract methods.( also allowed default methods & Static methods from java8 onwards)
An abstract method is a method contains definition but not body(Un-implemented method).
Methods in interface are public.
Interface supports the functionality of multiple inheritance.
We can define interface with interface keyword.
A class extends another class, an interface extends another interface but a class implements an interface.
We can create Object reference for Interface but we cannot instantiate interface.
*/
interface Shape {
    int length=10; //final & static
    int width=20; //final & static

    void circle(); //abstract method, un implemented method, no implementation

   default void square(){ // default method - add default to implement method, if not its incorrect
        System.out.println("this in square default method");
    }

   static void rectangle(){ //static method - add static, its allowed.
       System.out.println("this is rectangle");
   }
}

public class InterfaceDemo implements Shape{ //child

    public void circle(){ // we add public, if not is incorrect, and we implement the method because before we didnt
        System.out.println("this is circle");
    }

    public static void main(String[] args) {

        InterfaceDemo idobj=new InterfaceDemo();

        idobj.circle();
        idobj.square();
        Shape.rectangle(); //it is a static method, it can directly access from the interface

        //Shape.sh=new Shape(); //incorrect, we cant instantiate an interface

        Shape sh=new InterfaceDemo(); //we can create object using the child
        sh.circle();
        sh.square();
        //no rectangle, because we can access directly


    }
}
