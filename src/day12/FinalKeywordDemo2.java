package day12;

/*FINAL KEYWORD
2)we cannot override methods. its final method
3)you cannot extend the class into another class, because test1 is final class
 */
class Test1 {
    final void m(){
        System.out.println("this is m from Test1 class..");
    }
}

/*class Test2 extends Test1 { //incorrect
   // void m(){ // incorrect ,you cannot override because its final
        System.out.println("this is m from Test2 class..");
    } */


public class FinalKeywordDemo2 {

    public static void main(String[] args) {

    }
}
