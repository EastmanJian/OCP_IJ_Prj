package edu.exam.ocp.se6.sg.chapter2.methods.override;


public class HuaweiPhone extends Phone {
    static public void dial() {
        System.out.println("Child dial static method");
    }

    public static void main(String[] args) {
        HuaweiPhone huawei = new HuaweiPhone();
        Phone p = huawei;
        p.dial(); // -> Parent dial static method
        huawei.dial(); // -> Child dial static method
    }
}
