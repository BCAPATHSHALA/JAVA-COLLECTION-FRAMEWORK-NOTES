/* Class 2: TreeMap

The TreeMap in Java is used to implement the Map interface and NavigableMap along with the Abstract Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. This proves to be an efficient way of sorting and storing the key-value pairs. The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators.
*/


// Java program to demonstrate the
// creation of map object using the
// TreeMap Class in java

import java.util.*;


public class TreeMapExample {

    public static void main(String[] args)
    {

        // Creating an empty HashMap
        Map<String, Integer> map = new TreeMap<>();

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
{Five=5, Four=4, One=1, Three=3, Two=2}
Five=5 Four=4 One=1 Three=3 Two=2 {Five=5, Four=4, One=1, Two=2}
false
Five Four One Two 5 4 1 2 false
{1=10, Five=5, Four=4, One=1, Two=2}
false
*/




