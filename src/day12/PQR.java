package day12;

//THIS IS MULTIPLE INHERITANCE
public class PQR extends MNO implements ABC,XYZ{ //first extends only one class, then implements several

    @Override
    public void m1 () {
        System.out.println("this is m1 from ABC");
        System.out.println(x);
    }

    @Override
    public void m2 () {
        System.out.println("this is m2 from XYZ");
        System.out.println(y);
    }

    public static void main(String[] args) {

      PQR obj=new PQR();
      obj.m1(); //de abc interface
      obj.m2(); //de xyz interface
      obj.m3(); //de mno class


    }
}
