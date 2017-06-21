package edu.exam.ocp.se6.sg.chapter4.string;

/**
 * repeat a character for several times, using StringBuffer.setLength() and String.replace().
 * (This is out of SG Book)
 */
public class RepeatChar {
    public static void main(String[] args) {
        StringBuffer strBuf1 = new StringBuffer();
        strBuf1.setLength(15);
        String str = strBuf1.toString().replace("\u0000", "*");
        System.out.println(str); // -> ***************
    }
}
