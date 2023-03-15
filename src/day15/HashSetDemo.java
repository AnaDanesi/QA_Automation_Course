package day15;

import java.util.HashSet;
import java.util.Set;

/*HashSet   - a class implemented Set interface
---------
1) Heterogeneous data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed


 */
public class HashSetDemo {

    public static void main(String[] args) {

        //declaration
        HashSet myset=new HashSet();
        //Set myset=new HashSet();
        //HashSet <Integer>myset=new HashSet<Integer>();

        //add data
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add(null);
        myset.add(100); //doubles not allowed
        myset.add(null); //multiple null not allowed

        System.out.println(myset); //[null, 100, 10.5, welcome] insertion order not preserved

        //size
        System.out.println(myset.size()); //4

        //remove value from hashset (there is no index)
        myset.remove(10.5); //directly pass the value you want to remove, not index
        System.out.println("After removing:"+myset); //[null, 100, welcome]

        //insert value in the set > NOT POSSIBLE (we do not have any order or index)

        //get specific value from hashset > NOT POSSIBLE

        //read the data

        for(Object x:myset) {
            System.out.println(x);
        }



    }
}
