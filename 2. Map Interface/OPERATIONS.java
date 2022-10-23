// Java program to demonstrate
// the working of Map interface
/*
Operations 1: Adding Elements -> put()
Operation 2: Changing Element -> put()
Operations 3: Removing elements -> remove()
Operations 4: Iterating elements -> through map
*/

import java.util.*;
class OPERATIONS {
	public static void main(String args[])
	{
		// Default Initialization of a
		// Map
		Map<Integer, String> hm1 = new HashMap<>();

		// Initialization of a Map
		// using Generics
		Map<Integer, String> hm2 = new HashMap<Integer, String>();

		// Inserting the Elements
		hm1.put(1, "Geeks");
		hm1.put(2, "For");
		hm1.put(3, "Geeks");

		hm2.put(new Integer(1), "Geeks");
		hm2.put(new Integer(2), "For");
		hm2.put(new Integer(3), "Geeks");

		System.out.println(hm1);
		System.out.println(hm2);

		// Changing the Element(Update)
		hm1.put(3, "MANOJ");
		hm2.put(new Integer(3), "BCA PATHSHALA");

		System.out.println(hm1);
		System.out.println(hm2);

		// Removing element
		hm1.remove(3);
		hm2.remove(new Integer(3));

		System.out.println(hm1);
		System.out.println(hm2);


		// Iterating through the Map
		for (Map.Entry mapElement : hm1.entrySet()) // OR for (Map.Entry<Integer, String> mapElement : hm1.entrySet()) 
		{
			// Finding the key
            int key= (int)mapElement.getKey();
  
            // Finding the value
            String value= (String)mapElement.getValue();
  
            System.out.println(key + " : "+ value);
        }
	}
}

/*
OUTPUT:
{1=Geeks, 2=For, 3=Geeks}
{1=Geeks, 2=For, 3=Geeks}
{1=Geeks, 2=For, 3=MANOJ}
{1=Geeks, 2=For, 3=BCA PATHSHALA}
{1=Geeks, 2=For}
{1=Geeks, 2=For}
1 : Geeks
2 : For
*/