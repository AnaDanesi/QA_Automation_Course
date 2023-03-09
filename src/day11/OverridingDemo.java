package day11;


//METHOD OVERRIDING
/*1)Possible only in multiple classes/inheritance.
2) We should not change the definition of the method but body should change.
3)Method names are same.

//METHOD OVERLOADING
1) Possible in single and multiple classes/inheritance.
2) We should change the definition of the method (if not is duplicated).
3) Method names are same.
4) Related to polymorphism
 */
class Bank {
    double roi(){
        return 0.0;
    }
}

class ICICI extends Bank {
    double roi() {
        return 10.5;
    }
}

class AXIS extends Bank {
    double roi (){
        return 11.5;
    }
}

public class OverridingDemo {

    public static void main(String[] args) {

        ICICI ic=new ICICI();
        System.out.println(ic.roi()); //10.5

        AXIS ax=new AXIS();
        System.out.println(ax.roi()); //11.5

        Bank bn=new Bank();
        System.out.println(bn.roi()); //0.0


    }
}
