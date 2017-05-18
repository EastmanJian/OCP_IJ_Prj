package edu.exam.ocp.se6.pe.sat2.q13;

public class SafeDeposit {
    private static SafeDeposit singleton;
    public static SafeDeposit getInstance (int code) {
        if (singleton == null)
            singleton = new SafeDeposit(code);
        return singleton;
    }
    private int code;
    private SafeDeposit(int c) { code = c; }
    int getCode() { return code; }
}