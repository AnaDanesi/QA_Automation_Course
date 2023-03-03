package day6;


/* 2)Print Even and Odd numbers  from array.
        a={1,2,3,4,5,6}
        Even= 3
        Odd=3
         */
public class Assignment2EvenOddFromArray {

    public static void main(String[] args) {

        int a[]= {1,2,3,4,5,6};

        //Extracting Even numbers

        System.out.println("Even numbers in array.....");

      /*  for(int i=0;i<a.length;i++) {  //6
           if(a[i]%2==0)
               System.out.println(a[i]);
        }*/

        //Enhanced for lopp

        for(int value:a) {
            if (value % 2 == 0) {
                System.out.println(value); //2  //4  /6
            }
        }

        System.out.println("Odd numbers in array.....");

      /*  for(int i=0;i<a.length;i++) {  //6
            if(a[i]%2!=0)
                System.out.println(a[i]);
        }*/

        //Enhanced for lopp

        for(int value:a) {
            if (value % 2 != 0) {
                System.out.println(value); //1  //3  /5
            }
        }



    }

}
