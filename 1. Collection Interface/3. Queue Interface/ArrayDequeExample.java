/* Class 2: ArrayDeque

ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array. This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. Array deques have no capacity restrictions and they grow as necessary to support usage. Let’s understand ArrayDeque with an example:
*/


// Java program to demonstrate the
// creation of queue object using the
// ArrayDeque class in Java

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek()); // Print Top Element
        System.out.println(adq.peekFirst()); // Print First Element
        System.out.println(adq.peekLast()); // Print Last Element

        //Remove top element and print top element
        System.out.println(adq.poll()); 
        System.out.println(adq);

        //Remove first element and print first element
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        
        //Remove last element and print last element
        System.out.println(adq.pollLast());
        System.out.println(adq);

    }

}

/*
OUTPUT:
[12, 23, 45, 26]
12
12
26
12
[23, 45, 26]
23
[45, 26]
26
[45]

*/