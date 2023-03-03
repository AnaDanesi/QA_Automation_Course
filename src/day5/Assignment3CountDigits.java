package day5;

public class Assignment3CountDigits {

    public static void main(String[] args) {

        int num=123546;

        int count=0;

        while(num>0) {
            num=num/10;
            count++;
        }

        System.out.println("NUmber of digits in the number:"+count);

    }
}


//Count number of digits in a number
//input 423424
//output 6