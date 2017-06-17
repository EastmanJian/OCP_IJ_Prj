package edu.exam.ocp.se6.pe.pe1.q49;

/**
 * Example of PriorityQueue
 *
 * The add() and offer() methods have the same functionality, and it’s okay for PriorityQueues to have duplicate
 * elements. Remembering that PriorityQueues are sorted, the poll() method removes the first element in the queue
 * and returns it. The peek() method returns the first element from the queue but does NOT remove it.
 */

import java.util.PriorityQueue;

class Priorities {
    public static void main(String[] args) {
        PriorityQueue toDo = new PriorityQueue();
        toDo.add("dishes");
        toDo.add("laundry");
        toDo.add("bills");
        toDo.offer("bills");
        System.out.print(toDo.size() + " " + toDo.poll());
        System.out.print(" " + toDo.peek() + " " + toDo.poll());
        System.out.println(" " + toDo.poll() + " " + toDo.poll());
    }
}

/* ->
4 bills bills bills dishes laundry
*/