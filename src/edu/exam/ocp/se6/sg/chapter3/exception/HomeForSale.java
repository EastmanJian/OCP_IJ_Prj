package edu.exam.ocp.se6.sg.chapter3.exception;

/**
 * Example of IllegalArgumentException
 */
public class HomeForSale {
    private String agent;
    private double commission;
    public HomeForSale(String agent, double commission) {
        if(commission < 0.0 || commission > 1.0) {
            throw new IllegalArgumentException("commission must be between 0 and 1");
        }
        this.agent = agent;
        this.commission = commission;
    }
}