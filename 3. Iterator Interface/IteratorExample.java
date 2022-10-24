import java.io.*;
import java.util.*;

class IteratorExample {
	public static void main(String[] args)
	{
		

		// Declaring the List with initial size dynamic
		List<Integer> list1 = new ArrayList<Integer>();

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

       // Printing elements one by one
       System.out.print("Using Iterator Interface:");
       Iterator<Integer> it = list1.iterator();

       while (it.hasNext()) 
       {
           System.out.print(it.next()+" ");
       }
	}
}


/*
OUTPUT:
Using Iterator Interface:1 2 3 4 50 6 7 8 900 100
*/