package day11;

class ABC{
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}

class XYZ extends ABC { //total methods= 3
    void m1(int a){ //overriding method //1 only m1, its overriding
        System.out.println(a*a);
    }
    void m2(int a, int b){ //overloading method //2 m2 methods different
        System.out.println(a+b);
    }
}


public class OverridingsVsOverloading {
    public static void main(String[] args) {

        XYZ xyz=new XYZ();

        xyz.m1(100);
        xyz.m2(10);
        xyz.m2(10,20);

    }
}
