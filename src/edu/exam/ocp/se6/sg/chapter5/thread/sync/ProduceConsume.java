package edu.exam.ocp.se6.sg.chapter5.thread.sync;

/**
 * Example of wait(), notifyAll() in multi-threading.
 *
 * Similar to ProduceConsume1vs1 class, but this time, we use multiple Consumers,
 * Compare the difference if we use notifyAll() or notify() in the Producer.
 */
public class ProduceConsume {
    public static void main(String[] args) {
        MyStack2 stack = new MyStack2();
        Consumer c1 = new Consumer(1, stack);
        Consumer c2 = new Consumer(2, stack);
        Consumer c3 = new Consumer(3, stack);
        c1.start();
        c2.start();
        c3.start();
        Producer p = new Producer(stack);
        p.start();
    }
}

/* sample output if we use notifyAll() ->
Consumer 1: Waiting...
Consumer 2: Waiting...
Consumer 3: Waiting...
Producer: Just pushed 1
Producer: Just pushed 2
Producer: Just pushed 3
Producer: Just pushed 4
Producer: Just pushed 5
Producer: Just pushed 6
Producer: Just pushed 7
Producer: Just pushed 8
Producer: Just pushed 9
Producer: Notifying...
Consumer 2: Just popped 9
Consumer 1: Just popped 8
Consumer 3: Just popped 7
Consumer 1: Just popped 6
Consumer 3: Just popped 5
Consumer 2: Just popped 4
Consumer 2: Just popped 3
Consumer 3: Just popped 2
Consumer 1: Just popped 1
Consumer 3: Waiting...
Consumer 2: Waiting...
Consumer 1: Waiting...
Producer: Just pushed 1
Producer: Just pushed 2
Producer: Just pushed 3
...
 */

/* sample output if we use notify() ->
Consumer 1: Waiting...
Consumer 2: Waiting...
Consumer 3: Waiting...
Producer: Just pushed 1
Producer: Just pushed 2
Producer: Just pushed 3
Producer: Just pushed 4
Producer: Just pushed 5
Producer: Just pushed 6
Producer: Just pushed 7
Producer: Just pushed 8
Producer: Just pushed 9
Producer: Notifying...
Consumer 1: Just popped 9
Consumer 1: Just popped 8
Consumer 1: Just popped 7
Consumer 1: Just popped 6
Consumer 1: Just popped 5
Consumer 1: Just popped 4
Consumer 1: Just popped 3
Consumer 1: Just popped 2
Consumer 1: Just popped 1
Consumer 1: Waiting...
Producer: Just pushed 1
Producer: Just pushed 2
Producer: Just pushed 3
Producer: Just pushed 4
Producer: Just pushed 5
Producer: Just pushed 6
Producer: Just pushed 7
Producer: Just pushed 8
Producer: Just pushed 9
Producer: Notifying...
Consumer 2: Just popped 9
Consumer 2: Just popped 8
Consumer 2: Just popped 7
Consumer 2: Just popped 6
Consumer 2: Just popped 5
Consumer 2: Just popped 4
Consumer 2: Just popped 3
Consumer 2: Just popped 2
Consumer 2: Just popped 1
Consumer 2: Waiting...
Producer: Just pushed 1
Producer: Just pushed 2
Producer: Just pushed 3
Producer: Just pushed 4
Producer: Just pushed 5
Producer: Just pushed 6
Producer: Just pushed 7
Producer: Just pushed 8
Producer: Just pushed 9
Producer: Notifying...
Consumer 3: Just popped 9
Consumer 3: Just popped 8
Consumer 3: Just popped 7
Consumer 3: Just popped 6
Consumer 3: Just popped 5
Consumer 3: Just popped 4
Consumer 3: Just popped 3
Consumer 3: Just popped 2
Consumer 3: Just popped 1
Consumer 3: Waiting...
Producer: Just pushed 1
Producer: Just pushed 2
Producer: Just pushed 3
Producer: Just pushed 4
Producer: Just pushed 5
Producer: Just pushed 6
Producer: Just pushed 7
Producer: Just pushed 8
Producer: Just pushed 9
Producer: Notifying...
Consumer 1: Just popped 9
Consumer 1: Just popped 8
Consumer 1: Just popped 7
...
 */