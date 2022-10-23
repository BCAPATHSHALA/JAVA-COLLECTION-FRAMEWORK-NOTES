/* Class 1: LinkedList 

LinkedList is a class which is implemented in the collection framework which inherently implements the linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or queues. Let’s see how to create a queue object using this class.

*/


// Java program to demonstrate the
// creation of queue object using the
// LinkedList class

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Adding items to the queue
        // using offer()
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        // Printing the queue
        System.out.println(queue);

        // Printing the top element and removing it
        System.out.println(queue.poll());

        System.out.println(queue);

        // Printing the top element of
        // the LinkedList
        System.out.println(queue.peek());

    }
}

/*
OUTPUT:
[12, 24, 36]
12
[24, 36]
24
*/