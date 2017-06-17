package edu.exam.ocp.se6.pe.pe1.q07;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Q07 {
    public static void main(String[] args) {
        Date d = new Date();
        DateFormat df;
        Locale[] la = {new Locale("it", "IT"), new Locale("pt")};
        for(Locale l: la) {
            df = DateFormat.getDateInstance(DateFormat.FULL, l);
            System.out.println(df.format(d));
        }
    }
}

/* sample output ->
sabato 10 giugno 2017
Sábado, 10 de Junho de 2017
*/