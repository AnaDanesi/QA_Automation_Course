package day14;

import java.util.Scanner;

/*
try..catch block
try..catch..finally

try
{
------
}
catch(Exception e)
{
-----
}
finally
{
----
}

case1: Exception occured, catch block handled ---> finally block will execute
case2: Exception occured, catch block NOT handled --> finally block will execute
case3: Exception does not occured, catch block ignored ----> finally block will execute

*/
public class HandleExceptions {

    public static void main(String[] args) {

        System.out.println("Program is started...");
        System.out.println("Program is in progress...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        try {
            System.out.println(100 / num); //ArithmeticException
        }
        catch(ArithmeticException e){ //any name, for ex e
            System.out.println("You have entered invalid input.");
        }

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");

    }

}
