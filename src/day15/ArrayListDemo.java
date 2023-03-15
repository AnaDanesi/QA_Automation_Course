package day15;

import java.util.ArrayList;
import java.util.List;

/*Collections
-----------
Collection - To represent group of elements/objects/data into single entity then go for collections.

"Collection" is interface which is available in java.util package..


Arrays
--------
1) Size of array is fixed
2) Heterogeneous data not allowed ( multiple data values)

ArrayList - is class implemented List interface
-----
1) Heterogeneous data - allowed
2) Insertion order- preserved(Index)
3) Duplicate elements -- allowed
4) multiple nulls -- allowed

 */

/*class Employee {
    int empno;
    String empname;

    void displ(){
        //code
    }
}*/

public class ArrayListDemo {

    public static void main(String[] args) {

        //declaration (multiple, you can choose):

        ArrayList mylist=new ArrayList();
        //ArrayList <Integer>mylist=new ArrayList<Integer>(); //you have to specify the wrapper class only for specific data
        //List mylist=new ArrayList(); //list is interface

       /*
        Employee empobj1=new Employee();
        Employee empobj2=new Employee();
        Employee empobj3=new Employee();
        Employee empobj4=new Employee();
        Employee empobj5=new Employee();*/

        //adding data elements into arraylist (different to insertion) , at the end of the list
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);
       // mylist.add(empobj1);

        //size or arraylist
        System.out.println(mylist.size()); //7 elements
        System.out.println(mylist);//[100, 10.5, welcome, true, 100, null, null]

        //remove value from arraylist
        mylist.remove(3); //remove true
        System.out.println("After removing element 3:"+mylist);//[100, 10.5, welcome, 100, null, null]

        //inserting new element in the middle of the list
        mylist.add(2,"java"); //overloading, polymorphism. add can have 1 parameter (add 1 element at the end) oyr 2 parameters (add element in a specific position)
        System.out.println("After insertion:"+mylist); //[100, 10.5, java, welcome, 100, null, null]

        //capture one element from the list
        mylist.get(3);
        System.out.println(mylist.get(3));

        //read one element by one
        for(Object x:mylist){
            System.out.println(x);
        }

        //remove everything from arraylist
        mylist.clear();
        System.out.println("After clearing:"+ mylist); // [] (clear)
    }
}
