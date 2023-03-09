package day10;

public class StaticMain {

    public static void main(String[] args) {
        //1)static methods can access static stuff directly (without creating object)

        System.out.println(StaticExample.a); //we have to specify which class it belongs
        // System.out.println(b); //incorrect because b is non static variable

        StaticExample.m1();
        // m2(); //incorrect because m2 is a non static method

        //2) static methods can access non static stuff method through object only

        StaticExample se = new StaticExample();
        System.out.println(se.b);
        se.m2();

        se.m();
        //3)non static methods can access everything directly.


    }
}
