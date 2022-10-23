/* Class 3: TreeSet

TreeSet class which is implemented in the collections framework and implementation of the SortedSet Interface and SortedSet extends Set Interface. It behaves like a simple set with the exception that it stores elements in a sorted format. TreeSet uses a tree data structure for storage. Objects are stored in sorted, ascending order. But we can iterate in descending order using the method TreeSet.descendingIterator(). Let’s see how to create a set object using this class. 
*/


// Java program to demonstrate the
// creation of set object using the
// TreeSet class in Java

import java.util.TreeSet;
import java.util.Set;
import java.util.*;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

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

[2, 21, 32, 54, 65]
2
21
32
54
65
[2, 21, 32, 65]
true
false
4
[]

*/