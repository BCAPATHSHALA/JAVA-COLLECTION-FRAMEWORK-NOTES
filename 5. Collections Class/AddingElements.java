// Operation 1: Adding elements to the Collections 

// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AddingElements {

	public static void main(String[] args)
	{
		List<String> items = new ArrayList<>();

		// Adding elements (items) to the list
		items.add("Shoes");
		items.add("Toys");

		// Printing the list contents before adding more elements
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}

		System.out.println();

		// Add one or more elements using addAll() method
		Collections.addAll(items, "Fruits", "Bat", "Ball");

		// Printing the list contents after adding more elements
		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}

	}
}

/*
OUTPUT:
Shoes Toys
Shoes Toys Fruits Bat Ball
*/