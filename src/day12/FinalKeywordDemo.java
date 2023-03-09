package day12;

/*FINAL KEYWORD
1)we cannot change the variable, it stays constant
 */
class Test {
   final int x=100; //constant value, we cannot change
}
public class FinalKeywordDemo {

    public static void main(String[] args) {

        Test t=new Test();

        //t.x=200; //incorrect because x is final variable

        System.out.println(t.x);

    }
}
