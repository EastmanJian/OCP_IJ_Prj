package edu.exam.ocp.se6.pe.sat2.q13;

/**
 * It’s possible for SafeDeposit’s un-synchronized getInstance() method to return more than one instance of the class.
 * To enforce the singleton, we can add synchronized modifier to the getInstance() method.
 */
public class BeSafeMulti extends Thread {
    private int code;

    public BeSafeMulti(int code) {
        this.code = code;
    }

    public void run () {
        SafeDeposit sd = SafeDeposit.getInstance(code);  //SafeDeposit.getInstance() is un-synchronized.
        SafeDepositSync sds = SafeDepositSync.getInstance(code);  //SafeDepositSync.getInstance() is synchronized.
        System.out.println("SafeDeposit instance = " + sd + ", code = " + sd.getCode());
        System.out.println("SafeDepositSync instance = " + sds + ", code = " + sds.getCode());
    }

    public static void main(String[] args) {
        Thread t1 = new BeSafeMulti(10);
        Thread t2 = new BeSafeMulti(20);
        t1.start();
        t2.start();
    }

}

/* sample output ->
SafeDeposit instance = edu.exam.ocp.se6.pe.sat2.q13.SafeDeposit@1632e0d, code = 10
SafeDeposit instance = edu.exam.ocp.se6.pe.sat2.q13.SafeDeposit@ed7ea5, code = 20
SafeDepositSync instance = edu.exam.ocp.se6.pe.sat2.q13.SafeDepositSync@1a4dd11, code = 10
SafeDepositSync instance = edu.exam.ocp.se6.pe.sat2.q13.SafeDepositSync@1a4dd11, code = 10
 */
