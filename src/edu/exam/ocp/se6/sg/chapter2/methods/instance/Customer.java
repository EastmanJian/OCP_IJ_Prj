package edu.exam.ocp.se6.sg.chapter2.methods.instance;

/**
 * Example of instance method
 */
public class Customer {
    private String name;
    private int id;

    public Customer(int id, String name) {
        setId(id);
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void processOrder(String itemName) {
        System.out.println(this.getName() + " is ordering a "
                + itemName);
    }
    
    public static void main(String[] args) {
        Customer c = null;
        c.setName("Sherlock Holmes"); // -> NullPointerException in runtime
        System.out.println(c.getName());

        Customer y = new Customer(101, "Dr. Watson");
        System.out.println(y.getName()); // -> Dr. Watson
        Customer z = new Customer(202, "Mr. Rattigan");
        z.processOrder("Widget #4"); // -> Mr. Rattigan is ordering a Widget #4
        System.out.println(z.getName()); // -> Mr. Rattigan
    }
}