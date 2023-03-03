package day6;

//1) Find Sum of Elements in Array
//a={1,2,3,4,5}
//Sum=15

public class Assignment1SumOfArray {

    public static void main(String[] args) {

        int a[] = {5, 2, 7, 9, 6};

        int sum = 0;

     /*    for (int i = 0; i <= a.length - 1; i++) { // 0   1   2   3  4   5   //a.length-1=4
            sum = sum + a[i];  //5+2+7+9+6=29
        }*/


        //Enhanced for loop

        for(int value:a) {
            sum=sum+value; //0+5 // 5+2  // 7+7 // 14+9  // 23+6=29
        }



        System.out.println("Sum of Array elements:" + sum);
    }
}
