// Operation 3: Searching in a Collection

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SearchingElements{

	public static void main(String[] args)
	{
		List<String> items = new ArrayList<>();

		// Adding elements (items) to the list
		items.add("Shoes");
		items.add("Toys");
		items.add("Shoes");
		items.add("Fruits");
		items.add("Ball");
		items.add("GMan");

		Collections.sort(items);

		System.out.println();

		// BinarySearch on the List
        System.out.println("The index of Shoes is "+ Collections.binarySearch(items, "Shoes"));
 
        // BinarySearch on the List
        System.out.println("The index of Dog is "+ Collections.binarySearch(items, "Dog"));

	}
}

/*
OUTPUT:
The index of Shoes is 4
The index of Dog is -2
*/