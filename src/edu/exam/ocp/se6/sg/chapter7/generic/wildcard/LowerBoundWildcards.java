package edu.exam.ocp.se6.sg.chapter7.generic.wildcard;

import java.io.IOException;
import java.util.ArrayList;

public class LowerBoundWildcards {
    ArrayList<? super IOException> alist1 = new ArrayList<Exception>();
    ArrayList<? super IOException> alist2 = new ArrayList<IOException>();
    //ArrayList<? super IOException> alist3 = new ArrayList<FileNotFoundException>(); //compile error: incompatible types

}
