package edu.exam.ocp.se6.sg.chapter2.review.q05;

public class Television {
    private int channel = setChannel(7); //explicit initialization
    private String brand = "Konka"; //explicit initialization

    { setChannel(9); } //instance initializer call an instance method

    public Television(int channel) {
        this.channel = channel; //reassign the field value
        this.brand = "Skyway"; //reassign the field value
        System.out.print(channel + " ");
    }

    public int setChannel(int channel) {
        this.channel = channel;
        System.out.print(channel + " ");
        return channel;
    }

    public static void main(String[] args) {
        Television t = new Television(12);
        System.out.println(t.brand);
    }
}

/* ->
7 9 12 Skyway
*/