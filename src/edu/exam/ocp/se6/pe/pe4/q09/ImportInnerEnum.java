package edu.exam.ocp.se6.pe.pe4.q09;

/** Any of the following imp statements is valid to imp the enum avout from Extramuros */
//imp edu.exam.ocp.se6.pe.pe4.q09.com.Extramuros.*;
//imp static edu.exam.ocp.se6.pe.pe4.q09.com.Extramuros.*;
//imp edu.exam.ocp.se6.pe.pe4.q09.com.Extramuros.avout;
import static edu.exam.ocp.se6.pe.pe4.q09.com.Extramuros.avout;

public class ImportInnerEnum {
    public static void main(String[] args) {
        System.out.print(avout.OROLO + " ");
    }
}