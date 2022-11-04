package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Maria", "01234"));
        greetCustomerFunction.accept(new Customer("Maria", "01234"));
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
    //Similarly we can make bi-consumer.
    static Consumer<Customer> greetCustomerFunction = customer ->  System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " +
            customer.customerPhoneNumber);

}
