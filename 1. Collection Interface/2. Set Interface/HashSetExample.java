/* Class 1: HashSet

HashSet class which is implemented in the collection framework is an inherent implementation of the hash table data structure. The objects that we insert into the HashSet do not guarantee to be inserted in the same order. The objects are inserted based on their hashcode. This class also allows the insertion of NULL elements. Let’s see how to create a set object using this class. 
*/


// Java program to demonstrate the
// creation of set object using the
// HashSet class in Java

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();

        // Set<Integer> set = new TreeSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        //Print set by Iterator Interface
        Iterator <Integer> it=set.iterator();

        while (it.hasNext())
        {
        	System.out.println(it.next());
        }

        set.remove(54);

        System.out.println(set);

        System.out.println(set.contains(21));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);


    }
}

/*
OUTPUT:

[32, 65, 2, 21, 54]32
65
2
21
54
[32, 65, 2, 21]
true
false
4
[]

*/