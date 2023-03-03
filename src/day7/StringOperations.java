package day7;

public class StringOperations {

    public static void main(String[] args) {

        String s="welcome";
        //String s=new String("welcome");

        System.out.println(s);

        //length() - returns length of a string, a diferencia de arrays, lleva ()
        System.out.println(s.length()); //number of characters

        //concat() - joining strings
        String s1="welcome";
        String s2="to java";
        String s3="automation";

        System.out.println(s1+s2);  //welcometo java
        System.out.println(s1.concat(s2)); //welcometo java

        System.out.println(s1+s2+s3);
        System.out.println(s1.concat(s2).concat(s3));

        //trim() - remove right and left side spaces
        s="              automation             ";

        System.out.println(s.length()); //before trimming 37
        System.out.println(s.trim().length()); //after trimming 10

        //charAt() - returns a single character based on index we passed
        //index count starts from 0
        s="welcome";

        System.out.println(s.charAt(0)); //should return w
        System.out.println(s.charAt(3)); //should return c

        //contains() - returns bollean true/false
        s.contains("wel");

        System.out.println(s.contains("wel")); //true
        System.out.println(s.contains("com")); //true
        System.out.println(s.contains("Wel")); //false


        //equals() , equalsIgnoreCase() - compare 2 strings
        //returns boolean value

        s1="welcome";
        s2="WELCOME";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true. ignores cases


        //replace() - replace single or multiple characters in a string
        s="welcome to selenium automation testing selenium training";

        System.out.println(s.replace('e','X')); //wXlcomX to sXlXnium automation tXsting sXlXnium training
        System.out.println(s.replace("selenium","java")); //welcome to java automation testing java training


        //substring() - to extract substrings from main string
        //begining from 0, ending from 1

        s="welcome";

        System.out.println(s.substring(2,5)); //lco
        System.out.println(s.substring(1,4)); //elc
        System.out.println(s.substring(0,6)); //welcom

        //split() - divide the string into multiple parts using delimeter
        //should not use as a delimeter: *  $  ^  ?   .   +   -

        s="abc@gmail.com";

        String a[]=s.split("@");

        System.out.println(a[0]); //abc
        System.out.println(a[1]); //gmail.com

        //toUpperCase() , toLowerCase()
        s="WelCOME";

        System.out.println(s.toLowerCase()); //welcome
        System.out.println(s.toUpperCase()); //WELCOME



    }

}
