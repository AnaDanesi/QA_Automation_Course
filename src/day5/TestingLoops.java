package day5;

public class TestingLoops {

    public static void main(String[] args) {

       /* for(int i=1;i<=10;i++) {
            if(i==5) {
                System.out.println(i);
            }
        }

       for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 2 || i == 10) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i != 5 && i != 2 && i != 10) {
                System.out.println(i);
            }
        }*/

        boolean flag=false;  //o true, probar y ver

        if(flag) {
            for(int i=1;i<=5;i++) {
                System.out.println(i);
            }
        }
        else {
            for(int i=10;i>=1;i--) {
                System.out.println(i);
            }
        }
    }
}
