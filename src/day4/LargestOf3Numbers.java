package day4;

public class LargestOf3Numbers {

    public static void main(String[] args) {

        int a=300, b=2000, c=100;

        if(a>b && a>c) {
            System.out.println("A is the largest number");
        }
        else if(b>a && b>c) {
            System.out.println("B is the largest number");
        }
        else  {
            System.out.println("C is the largest number");
        }

    }
}
