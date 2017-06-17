package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * Example of IllegalStateException
 */
public class CustomerOrder {
    private String address;

    public void shipOrder() {
        if (address == null) {
            throw new IllegalStateException("address must be set first");
        }
        System.out.println("Shipping order...");
    }
}
