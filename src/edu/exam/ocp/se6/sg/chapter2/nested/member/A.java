package edu.exam.ocp.se6.sg.chapter2.nested.member;

/**
 * Member Inner Class example
 *
 * special syntax for accessing a field in the outer class that you need to use if the outer class has a same name
 * with a field or method as the inner class.
 */
public class A {
    private int x = 10;

    public class B {
        private int x = 15;

        public class C {
            private int x = 20;

            public void go() {
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(B.this.x);
                System.out.println(A.this.x);
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.go();
    }
}

/* ->
20
20
15
10
*/