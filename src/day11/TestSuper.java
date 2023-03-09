package day11;
//SUPER KEYWORD
/*
1)Invokes immediate parent class variable (justo la de arriba)
2)Invokes immediate parent class method
 */
public class TestSuper {

    public static void main(String[] args) {

        Dog d=new Dog();
        d.displayColor();//white, because we put super.color

        d.eat(); // como puse super keyword, aparece lo de animal

    }
}
