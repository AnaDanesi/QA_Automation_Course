package day3;

public class TernaryOperators {

    public static void main(String[] args) {

        //  var=exp ? result1 : result2

        int a=200, b=100;

        // example 1
      //  int x= a>b ? a : b;

      //  System.out.println(x); //200

        //example 2
        int x= b<a ? b : a;

        System.out.println(x); //100

        //example 3
        a=1000;
        b=2000;

        x=b<a? b: a;

        System.out.println(x); //1000

        //example 4
        x=(1==1) ? 100 : 200;

        System.out.println(x); //100

        //example 5
        int age=20;

        String res=age>=18 ? "Eligible for vote" : "Not elegible for vote";

        System.out.println(res); // Elegible for vote
    }
}
