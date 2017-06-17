package edu.exam.ocp.se6.sg.chapter7.collection.queue;

/**
 * Example of LinkedBlockingQueue.
 *
 * FIFO basis.
 */

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

class LinkedBlocking {
    public static void main(String[] args) {
        Queue<String> toDo = new LinkedBlockingQueue<>();
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
4 dishes laundry laundry bills bills
*/