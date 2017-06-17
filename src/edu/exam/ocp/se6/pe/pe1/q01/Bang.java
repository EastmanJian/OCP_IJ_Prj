package edu.exam.ocp.se6.pe.pe1.q01;

public class Bang extends Thread {
    static long startMs = System.currentTimeMillis();
    static long endMs;
    static Thread t1, t2, t3;

    public static void main(String[] args) throws Exception {
        t1 = new Thread(new Bang());
        t2 = new Thread(new Bang());
        t3 = new Thread(new Bang());
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End of Main");
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getId() + " ");
            if (i == 250)
                try {
                    System.out.println("**" + t1.getId() + "**");
                    t1.sleep(600); //always cause current thread to sleep
                } catch (Exception e) {
                }
        }
        endMs = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getId() + " ends. Time elapsed (MS)： " + (endMs - startMs));
    }
}

/* sample output ->
End of Main
10
10
12
10
14
10
14
12
...
12
10
14
10
10
10
**10** //Thread 10 sleep 600MS
12
12
12
12
12
12
12
14
14
14
14
12
12
12
12
12
...
12
12
12
14
14
**10**  //Thread 14 sleep 600MS
12
12
12
12
12
12
12
12
12
12
12
12
12
...
12
12
12
**10**  //Thread 12 sleep 600MS
10
10
10
10
10
10
10
10
10
10
10
10
10
...
10
10
10
...
10
10
10 ends. Time elapsed： 611
14
14
14
...
14
14
12
12
12
12
14
12
12
12
12
14
14
14
14
14
...
14 ends. Time elapsed： 613
12
12
12
...
12
12
12 ends. Time elapsed： 615

 */