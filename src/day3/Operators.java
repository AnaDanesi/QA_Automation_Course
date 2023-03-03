package day3;

public class Operators {
    public static void main(String[] args) {

        //1) Atrithmetic operators +-*/%

        int a=20, b=10;

        System.out.println("la suma de a y b es:" +(a+b));

        //2) Relational or comparison operators >< <= >= != ==
       //return true/false (boolean value)

       System.out.println(a>b); //true
        System.out.println(a<b); //false

       b=20;

       System.out.println(a>=b); //true
        System.out.println(a<=b); //true

        System.out.println(a!=b); //false
        System.out.println(a==b); //true

        //3)logical operators && || !
        //works between 2 or more  boolean values only
        //always returns true or false

        boolean x=true;
        boolean y=false;

        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println( !x); //false

        boolean b1=10>20; // false
        boolean b2=20>10; //true

        System.out.println(b1 && b2); //false
        System.out.println(b1 || b2); //true





    }
}
