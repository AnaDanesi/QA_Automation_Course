package day14;

/*Exception handling
-----------------

Errors
------
1) Syntax
2) Logical

Exception occures when the user provided invalid input to the program.
Exception is an event which will cause program termination.

1) Checked exceptions
	The exceptions which are identified by java compiler.

	Ex: Interrupted exception
     		FileNotFound
		IOException

2) Un-checked exceptions
	The exceptions which are not identified by java compiler.
Ex:
		ArithmeticExeption
		NullPointerException
		ArrayIndexOutOfBoundsException etc...
			etc...
*/
import java.util.Scanner;

public class ExceptionsDemo {

    public static void main(String[] args) {

        System.out.println("Program is started...");
        System.out.println("Program is in progress...");

        //Example1

      /*  Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=sc.nextInt();

        System.out.println(100/num); //ArithmeticException

       */

        //Example2

       /* int a[]=new int[5]; //0...4
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();

        System.out.println("Enter position (0-4):");
        int pos=sc.nextInt();

        a[pos]=num;

        System.out.println(a[pos]); //ArrayIndexOutOfBoundsException */

        //Example3

        String s="welcome";

        int num=Integer.parseInt(s);
        System.out.println(num); //NumberFormatException (invalid data)

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");

    }

}
