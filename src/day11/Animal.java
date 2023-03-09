package day11;

public class Animal { //parent class

    String color="white";

    void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal { //child class
    String color="black";

    void displayColor(){
        System.out.println(super.color);//super represents parent class
    }

    void eat(){
        System.out.println("eating bread");
        super.eat();//va a llamar al de animal, no al de dog
    }
}
