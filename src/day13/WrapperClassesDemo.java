package day13;
/*Wrapper Classes
-----------------
The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

byte              Byte
short			  Short
int			      Integer
long			  Long
float			  Float
double		      Double
char			  Character
boolean		      Boolean


String    length() substring() trim() etc....
String s="welcome"*/

public class WrapperClassesDemo {

    public static void main(String[] args) {

        //int a=100;  //primitive variable data type, we cannot access to methods
        //System.out.println(a);

        //Integer a=100; //object variable, we can access to methods
        //System.out.println(a);

        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.0F;
        double d=60.0D;
        char c='a';
        boolean b2=true;

        //converting primitives into objects: AUTOBOXING

        Byte byteobj=b;
        Short shortobj=s;
        Integer intobj=i;
        Long longobj=l;
        Float floatobj=f;
        Double doubleobj=d;
        Character charobj=c;
        Boolean boolobj=b2;

        System.out.println("Byte object: "+byteobj);
        System.out.println("Short object: "+shortobj);
        System.out.println("Integer object: "+intobj);
        System.out.println("Long object: "+longobj);
        System.out.println("Float object: "+floatobj);
        System.out.println("Double object: "+doubleobj);
        System.out.println("Character object: "+charobj);
        System.out.println("Boolean object: "+boolobj);

        //converting objects to primitives: UNBOXING

        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;
        long longvalue=longobj;
        float floatvalue=floatobj;
        double doublevalue=doubleobj;
        char charvalue=charobj;
        boolean boolvalue=boolobj;

        System.out.println("byte value:  " + bytevalue);
        System.out.println("short value:  " + shortvalue);
        System.out.println("int value:  " + intvalue);
        System.out.println("long value:  " + longvalue);
        System.out.println("float value:  " + floatvalue);
        System.out.println("double value:  " + doublevalue);
        System.out.println("char value:  " + charvalue);
        System.out.println("bolean value:  " + boolvalue);


    }
}
