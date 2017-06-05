package edu.exam.ocp.se6.sg.chapter2.inst.construcor;

/**
 * The child will invoke super's default constructor first if the child does not explicitly invoke father's
 * other constructor.
 * There will be compiler error if the parent class does not have a no-argument constructor while the child's
 * constructor is not explicitly invoke parrent's constructor.
 */
class C extends P {
//    public C(String s){} //Compile error: cannot find symbol symbol: class P
    public C(String s) {
        super(s);
    }
}
