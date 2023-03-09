package day13;
/*
Access modifiers
-------------
public - we can access everywhere
protected - we can access  outside of the package but through inheritance
default - only within the package
private - only within the class

 */
public class TestMain {

    public static void main(String[] args) {

        Test t=new Test();

        System.out.println(t.x);

        t.m1();

    }

}
