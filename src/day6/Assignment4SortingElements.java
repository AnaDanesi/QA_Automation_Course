package day6;

import java.util.Arrays;
import java.util.Collections;

public class Assignment4SortingElements { //BUILDING METHOD

    public static void main(String[] args) {

        //Approach1 - Parallel sorting

        /*int a[]={30,50,20,10,60};
        System.out.println("Array Elements before sorting:"+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("Array Elements after sorting:"+ Arrays.toString(a));
*/

        //Approach2 - Sort method

        /*int a[]={30,50,20,10,60};
        System.out.println("Array Elements before sorting:"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array Elements after sorting:"+ Arrays.toString(a));*/

        //Approach3 - Reverse Descending Order sort method

        Integer a[]={30,50,20,10,60};
        System.out.println("Array Elements before sorting:"+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder()); //poner integer en vez de int sino no soporta
        System.out.println("Array Elements after sorting:"+ Arrays.toString(a));


    }

}
