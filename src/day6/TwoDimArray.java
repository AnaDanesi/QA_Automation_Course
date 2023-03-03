package day6;

/*
1) Declare an array
2) Insert values into array
3) Find size of an array
4) Read single value from an array
5) Read multiple values from an array.
 */
public class TwoDimArray {

    public static void main(String[] args) {

        //1) declaration

        //approach 1 (cuando tenemos pocos values)

        /*int a[][]=new int [3][2];

        //int [][]a=new int [3][2];

        //int []a[]=new int [3][2];

        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;*/

        //approach 2 (mas filas y columnas, igualmente es two dimmension)

        //int a[][]= {{100,200},{300,400},{500,600}};

        int a[][]= {
                {100,200},
                {300,400},
                {500,600}
        };

        //length of an array

        System.out.println(a.length); //3 rows
        System.out.println(a[0].length); //2 columns

        //read specific value

        //System.out.println(a[2][0]); //500


        //read data from array using classic for loop

        /*for(int r=0;r<a.length;r++) { //outer for loop , row es r //3  r=0   1   2    3

            for(int c=0;c<a[r].length;c++) {  //inner for loop , column es c//2  c=0  1   2

             System.out.print(a[r][c]+"    ");//100   200   300  400  500   600
            }
            System.out.println();
        } //tambien sirve para mas columns and rows.

         */

        //read data from array using enhanced for loop

        for(int x[]:a) {

            for(int v:x) {

                System.out.print(v+"  ");

            }

            System.out.println();
        }






    }
}
