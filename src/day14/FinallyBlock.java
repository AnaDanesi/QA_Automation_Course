package day14;
/*ry
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
import java.util.Scanner;

public class FinallyBlock {

    public static void main(String[] args) {

        System.out.println("Program is started...");
        System.out.println("Program is in progress...");

        String s=null;

        try {
            System.out.println(s.length()); //if i do not know the exception type
        }
        catch(Exception e){
            System.out.println("Exception occured ... handled");
        }
        finally {
            System.out.println("Entered im finally block");
        }

        System.out.println("Program is completed");
        System.out.println("Program is exited");

    }
}
