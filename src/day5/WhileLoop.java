package day5;

public class WhileLoop {

    public static void main(String[] args) {

        //Example 1: print 1 to 10 numbers.

       /* int i=1; //initialization

        while(i<=10) {  //condition  1  2  3  4  5  6  7  8  9  10 , luego 11 es mayor a 10, entonces termina el loop.
            System.out.println(i); //printing  1  2  3  4  5  6  7  8  9  10
            i++; //incrementation //1  2  3  4  5  6  7  8  9  10  11
        }*/

        //Example 2: print Hello 10 times...

       /* int i=1;

        while(i<=10) {
            System.out.println("Hello");
            i++;
        }*/

        //Example 3: print even numbers between 1 to 10
        //Approach 1

        /*int i=2;

        while(i<=10) {
            System.out.println(i); // 2
            i+=2;//i=i+2;
        } */

        //Approach 2

        int i = 1;

        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
