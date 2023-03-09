package day13;
/*Data Conversion methods / we use Wrapper class
--------------
String s1="10.50";
String s2="20"
String s="true"

----3 mas important:
String  ----> int          Integer.parseInt()
String -----> double       Double.parseDouble()
String ----> boolean	   Boolean.parseBoolean()


int phoneno=12312387;

int ----> String       String.valueOf(data)
double--->String       String.valueOf(data)
boolean --->String     String.valueOf(data)
char---->String        String.valueOf(data)

String -->char  ( not possible), because string is multiple characters, in char only fits one character

 */
public class DataConversion {

    public static void main(String[] args) {

        //String--->int

        /*String s="welcome"; //not possible to convert to number because it is alphabet
        String s1="10";
        String s2="20";

        System.out.println(s1+s2); //1020
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //30

        //String--->double

        String s1="150.15";
        String s2="130.20";

        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));

        //String--->boolean

        String s="true";

        System.out.println(Boolean.parseBoolean(s));*/

        //int, double, char, boolean----> string

        int a=10;
        double d=15.15;
        char c='A';
        boolean b=false;

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(b));



    }

}
