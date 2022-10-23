// Operation 2: Sorting a Collection

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortingElements{

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

		// Printing the list contents before sorting
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}

		System.out.println();

		// Sorting according to default ordering using sort() method
        Collections.sort(items);

        // Printing the list contents after sorting
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}

		 System.out.println();
 
        // Sorting according to reverse ordering
        Collections.sort(items, Collections.reverseOrder());
 
        // Printing the reverse order
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }


	}
}

/*
OUTPUT:
Shoes Toys Shoes Fruits Ball GMan
Ball Fruits GMan Shoes Shoes Toys
Toys Shoes Shoes GMan Fruits Ball
*/