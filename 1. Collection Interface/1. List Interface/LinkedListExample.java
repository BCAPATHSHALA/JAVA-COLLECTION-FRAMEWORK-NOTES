/* Class 3: LinkedList

LinkedList is a class that is implemented in the collection framework which inherently implements the linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. Let’s see how to create a list object using this class.
*/


// Java program to demonstrate the
// creation of list object using the
// LinkedList class

import java.io.*;
import java.util.*;

class LinkedListExample {
	public static void main(String[] args)
	{
		

		// Declaring the List with initial size dynamic
		List<Integer> list1 = new Vector<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(50);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(900);
		list1.add(100);

		System.out.print("Dynamic List: "+list1);
		System.out.println();

		// Size of ArrayList
		int n = 10;

		// Declaring the List with initial size n
		List<Integer> list = new Vector<Integer>(n);

		// Appending the new elements
		// at the end of the list
		for (int i = 1; i <= n; i++)
		{
			list.add(i);
		}


		// Printing elements
		System.out.println("List : "+list);

		//printing size of array list
		System.out.println("List size: "+list.size());

		// Remove element at index 3
		list.remove(3);

		// Displaying the list after deletion
		System.out.println("List After Deleting at Index 3: "+list);

		// This will remove 8 from the list
		list.remove(Integer.valueOf(8)); 
       	System.out.println("List After Deleting 8: "+list);

		// Update element 20 at index 1
		list.set(1,20);

		// Displaying the list after update
		System.out.print("List After Update at Index 1: "+list);
		System.out.println();

		//Check element is in list or not
		System.out.println("List me 500 Value hai: "+list.contains(500));


		// Method 01: Printing elements one by one
		System.out.print("Using For Loop: ");
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// Method 02: Printing elements one by one
		System.out.print("Using For Each Loop: ");
		for (Integer element: list) 
		{
           System.out.print(element+" ");
        }
       System.out.println();

       // Method 03: Printing elements one by one
       System.out.print("Using Iterator Interface:");
       Iterator<Integer> it = list.iterator();

       while (it.hasNext()) 
       {
           System.out.print(it.next()+" ");
       }

       //This will remove all the elements from the list.
       System.out.println();
       list.clear(); 
       System.out.println("Empty list: "+list);
	}
}


/*
OUTPUT:
Dynamic List: [1, 2, 3, 4, 50, 6, 7, 8, 900, 100]
List : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
List size: 10
List After Deleting at Index 3: [1, 2, 3, 5, 6, 7, 8, 9, 10]
List After Deleting 8: [1, 2, 3, 5, 6, 7, 9, 10]
List After Update at Index 1: [1, 20, 3, 5, 6, 7, 9, 10]
List me 500 Value hai: false
Using For Loop: 1 20 3 5 6 7 9 10
Using For Each Loop: 1 20 3 5 6 7 9 10
Using Iterator Interface:1 20 3 5 6 7 9 10
Empty list: []
*/


/*________________________________________________________________________________________________________*/
// EXAMPLE:02
public class LearnArrayList {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(1, 50); // This will add 50 at index 1. All the other elements will be shifted to right.
        System.out.println(list);

        List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println("List empty hai kay: "+list.isEmpty());
    }
}

/*
OUTPUT:
[1, 2, 3]
[1, 2, 3, 4]
[1, 50, 2, 3, 4]
[1, 50, 2, 3, 4, 150, 160]
50
*/