/* Class 2: LinkedHashMap

LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it. 

HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order.
*/


// Java program to demonstrate the
// creation of map object using the
// LinkedHashmap Class in java

import java.util.*;


public class LinkedHashMapExample {

    public static void main(String[] args)
    {

        // Creating an empty HashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Inserting entries in the Map
        // using put() method
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        
        // Printing the map
        System.out.println(map);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())
        {
            // Printing key-value pairs OR
            // System.out.println(e.getKey() + "="+ e.getValue());

            // Printing key-value pairs
            System.out.print(e+" ");

        }

        //remove element
        map.remove("Three");
        
        // Printing the map
        System.out.println(map);
        
        //Value is here or no
        System.out.println(map.containsValue(3));
            
        // Printing Only Key 
        for(String key: map.keySet()) {
            System.out.print(key+" ");
        }

        // Printing Only Value
        for(Integer value: map.values()) {
            System.out.print(value+" ");
        }
        
        //Map is empty or not
        System.out.println(map.isEmpty());
        
        //Update Element
        map.put("1",10);
        
        // Printing the map
        System.out.println(map);
        
        //Map is empty or not
        System.out.println(map.isEmpty());

    }
}


/*
OUTPUT:
{One=1, Two=2, Three=3, Four=4, Five=5}
One=1 Two=2 Three=3 Four=4 Five=5 
{One=1, Two=2, Four=4, Five=5}
false
One Two Four Five 1 2 4 5 
false
{One=1, Two=2, Four=4, Five=5, 1=10}
false
*/




