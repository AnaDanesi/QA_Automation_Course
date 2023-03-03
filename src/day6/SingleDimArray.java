package day6;

import java.util.Arrays;

/*
1) Declare an array
2) Insert values into array
3) Find size of an array
4) Read single value from an array
5) Read multiple values from an array.
 */
public class SingleDimArray {

    public static void main(String[] args) {

        //declaration

        //approach 1: pasos 1 y 2 por separado

        /*int a[]=new int[5];  //declare

        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=500;
        a[4]=600;*/

        //approach 2: pasos 1 y 2 juntos

        int a[] = {100, 200, 300, 400, 500, 600};

        // paso 3: size/length of an array

        System.out.println(a.length); //6

        // paso 4: get a single value from array

        System.out.println(a[3]); //400

        // paso 5: get all the values from an array (all together)

        System.out.println(Arrays.toString(a)); //100 200 300 400 500 600

        //get the data one by one, we have to write a loop (logic)

        /*for(int i=0;i<6;i++) {    // o i<=5 // y si no sabemos el largo, i<a.length
            System.out.println(a[i]);
        }

        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
            }
        */

        // read data from array using enhanced for loop

        for (int x:a) { //el valor de x va cambiando y se va guardando de 100 a 600. more easier this
            System.out.println(x);
        }


    }
}
