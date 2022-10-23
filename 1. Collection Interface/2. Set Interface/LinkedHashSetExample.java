/* Class 2: LinkedHashSet

LinkedHashSet class which is implemented in the collections framework is an ordered version of HashSet that maintains a doubly-linked List across all elements. When the iteration order is needed to be maintained this class is used. When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. Let’s see how to create a set object using this class. 
*/


// Java program to demonstrate the
// creation of set object using the
// LinkedHashSet class in Java

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

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

[32, 2, 54, 21, 65]
32
2
54
21
65
[32, 2, 21, 65]
true
false
4
[]

*/