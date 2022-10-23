/* Class 1: HashMap

It stores the data in (Key, Value) pairs. To access a value one must know its key. 

This class uses a technique called Hashing. Hashing is a technique of converting a large String to a small String that represents the same String. A shorter value helps in indexing and faster searches.

*/


// Java program to demonstrate the
// creation of map object using the
// Hashmap Class in java

import java.util.*;


public class HashMapExample {

    public static void main(String[] args)
    {

        // Creating an empty HashMap
        Map<String, Integer> map = new HashMap<>();

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
{Five=5, One=1, Four=4, Two=2, Three=3}
Five=5 One=1 Four=4 Two=2 Three=3 
{Five=5, One=1, Four=4, Two=2}
false
Five One Four Two 
5 1 4 2 
false
{1=10, Five=5, One=1, Four=4, Two=2}
false
*/