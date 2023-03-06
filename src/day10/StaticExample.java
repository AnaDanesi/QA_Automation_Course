package day10;

public class StaticExample {

    static int a=10; //static variable
    int b=20; //non static variable

    static void m1(){ //static method
        System.out.println("this is m1 a static method");
    }
    void m2(){//non static method
        System.out.println("this is m2 non static method");
    }

    void m() { //non static method can access everything directly.
        System.out.println(a);
        System.out.println(b);

        m1();
        m2();
            }



   /* public static void main(String[] args) {
        //1)static methods can access static stuff directly (without creating object)

        System.out.println(a);
       // System.out.println(b); //incorrect because b is non static variable

        m1();
       // m2(); //incorrect because m2 is a non static method

        //2) static methods can access non static stuff method through object only

        StaticExample se=new StaticExample();
        System.out.println(se.b);
        se.m2();

        se.m();
        //3)non static methods can access everything directly.

    }*/
}
