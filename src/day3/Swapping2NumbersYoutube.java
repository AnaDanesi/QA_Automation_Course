package day3;

public class Swapping2NumbersYoutube {

    public static void main(String[] args) {

        int a=10, b=20;

        System.out.println("Before swapping values are.."+a+"  "+b);

        //Logic 1) Third variable

        /*int t=a;
        a=b;
        b=t;*/

        System.out.println("After swappings values are.."+a+"  "+b);

        //Logic 2) use + & without using third variable

        /*a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b; //30-10=20 */

        //Logic 3) use * and / without using third variable
        //here a &b should not ve zero

       /* a=a*b; //10*20=200
        b=a/b; //200/20=10
        a=a/b; //200/10=20 */

        //Logic 4) Bitwise XOR (^)

        /*a=a^b; //10^20=30
        b=a^b; //30^20=10
        a=a^b; //30^10=20 */

        //Logic 5) With single statement
        //a=10   b=20

        b=a+b-(a=b); // a=20   b=10

    }
}
