package day15;

import java.util.HashMap;
import java.util.Map;

/*HashMap - a class implemented Map interface
--------------
Data can be stored in the form of key, value pairs.
Key is unique. But we can have duplicate values.
Insertion order not preserved(Index not followed)

 */
public class HashMapDemo {

    public static void main(String[] args) {

        //declaration
        //HashMap hm=new HashMap();
        //Map hm=new HashMap<>();

        HashMap<Integer, String> hm=new HashMap<Integer, String>(); //integer in keys, strings in the values

        //adding data pairs to hashmap
        hm.put(101,"John"); //(key, value)
        hm.put(102,"Scott");
        hm.put(103,"Mary");
        hm.put(104,"John");
        hm.put(101,"David");

        System.out.println(hm); //{101=David, 102=Scott, 103=Mary, 104=John}
        //if you duplicate the keys, the record would be the last one

        //size of the set, how many pairs
        System.out.println(hm.size()); //4

        //remove some pair
        hm.remove(103); //103 is key
        System.out.println("after removing:"+hm); //:{101=David, 102=Scott, 104=John} //the entire pair is removed

        //get specific value
        hm.get(102); //102 is key, we can extract the value
        System.out.println(hm.get(102)); //Scott

        //print only keys from hashmap
        System.out.println(hm.keySet()); //[101, 102, 104]

        //print only values from hashmap

        for(Object k:hm.keySet()){
            System.out.println(hm.get(k)); //David Scott John
            System.out.println(k+"     "+hm.get(k));//print pairs like table
        }

        //clear all the data of the hashmap
        hm.clear();
        System.out.println(hm); //{}
        

    }
}
