package day3;

public class DecrementOperators {
    public static void main(String[] args) {

        // -- decrement operator

        int a=100;

        //Scenario 1

        //a--;
       // --a;

        //System.out.println(a); //99   //99

        //Scenario 2

       int res=a--;
       // int res=--a;

        System.out.println(res); //100 //99
        System.out.println(a); //99 // 99
    }
}
