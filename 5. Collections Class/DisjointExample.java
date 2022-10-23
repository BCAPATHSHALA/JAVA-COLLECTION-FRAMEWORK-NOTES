// Operation 5: Disjoint Collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DisjointExample {

	public static void main(String[] args)
	{
		// Create list1
		List<String> list1 = new ArrayList<>();

		list1.add("Shoes");
		list1.add("Toys");
		list1.add("Horse");
		list1.add("Tiger");

		// Create list2
		List<String> list2 = new ArrayList<>();

		list2.add("Bat");
		list2.add("Frog");
		list2.add("Lion");

		// Check if disjoint or not
		System.out.println(Collections.disjoint(list1, list2));
	}
}

/*
OUTPUT:
true
*/
