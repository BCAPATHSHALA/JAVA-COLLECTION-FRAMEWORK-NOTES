/* Class 4: Stack

Stack is a class that is implemented in the collection framework and extends the vector class models and implements the Stack data structure. The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek. Let’s see how to create a list object using this class.
*/


// Java program to demonstrate the
// creation of list object using the
// Stack class

import java.io.*;
import java.util.*;

class StackListExample{
	public static void main(String[] args)
	{
		

		// Declaring the List with initial size dynamic
		List<Integer> list1 = new Stack<Integer>();

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
		List<Integer> list = new ArrayList<Integer>(n);

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
import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());

        animals.pop();

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());
    }
}

/*
OUTPUT:
Stack: [Lion, Dog, Horse, Cat]
Cat
Stack: [Lion, Dog, Horse]
Horse
*/