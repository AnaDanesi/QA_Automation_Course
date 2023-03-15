package day14;

import java.util.Scanner;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program is started...");
        System.out.println("Program is in progress...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        String s=null;
/*
        try {
            System.out.println(s.length()); //if i do not know the exception type
        }
        catch(ArithmeticException e){ //any name, for ex e
            System.out.println("Arithmetic exception thrown.");
        }
        catch(NumberFormatException e){ //any name, for ex e
            System.out.println("Number format exception thrown.");
        }
        catch(NullPointerException e){ //any name, for ex e
            System.out.println("Null pointer exception thrown.");
        }*/

       /* try {
            System.out.println(100 / num); //if i do not know the exception type
        }
        catch(ArithmeticException e){ //any name, for ex e
           System.out.println("Arithmetic exception thrown.");
        }
        catch(NumberFormatException e){ //any name, for ex e
            System.out.println("Number format exception thrown.");
        }
        catch(NullPointerException e){ //any name, for ex e
            System.out.println("Null pointer exception thrown.");
        }*/

        try{
            System.out.println(s.length());
        }
        catch (Exception e) {
            System.out.println("exception thrown"); //best solution if you do not know the exception

        }

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");


    }
}
