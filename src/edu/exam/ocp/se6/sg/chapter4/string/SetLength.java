package edu.exam.ocp.se6.sg.chapter4.string;

/**
 * Example of StringBuffer.setLength()
 * It can turn a string to a specific length
 * (This is out of SG Book)
 */
public class SetLength {
    public static void main(String[] args) {
        String testStr = "abc";
        StringBuffer strBuf = new StringBuffer(testStr);
        strBuf.setLength(15);
        testStr = strBuf.toString();
        System.out.println(testStr); // -> abc
        System.out.println(testStr.replace("\u0000", "_")); // -> abc____________
    }
}
