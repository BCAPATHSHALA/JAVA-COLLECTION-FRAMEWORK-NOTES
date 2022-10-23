/* Class 3: PriorityQueue

A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority and this class is used in these cases. The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a "Comparator" provided at queue construction time, depending on which constructor is used. Let’s understand the priority queue with an example:
*/


// Java program to demonstrate the
// creation of queue object using the
// priority queue in Java

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();// remove the top element

        System.out.println(pq);

        System.out.println(pq.peek());// print the top element

    }

}

/*
OUTPUT:
[40, 36, 24, 12]
[36, 12, 24]
36



NOTE: Queue<Integer> pq = new PriorityQueue<>();

[12, 36, 24, 40]
[24, 36, 40]
24
*/