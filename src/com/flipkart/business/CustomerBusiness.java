package com.flipkart.business;

import com.flipkart.bean.Customer;

public class CustomerBusiness implements CustomerInterface {

    Customer customer[] = new Customer[3];


    public void createCustomer() {
        System.out.println("Creating a new customer");

        // add first record
        customer[0] = new Customer();
        customer[0].setCustomerId(101);
        customer[0].setCustomerName("John");
        customer[0].setCustomerAddress("xyz");

        //add second record
        customer[1] = new Customer();
        customer[1].setCustomerId(102);
        customer[1].setCustomerName("Jane2");
        customer[1].setCustomerAddress("xyz2");

        customer[2] = new Customer();
        customer[2].setCustomerId(103);
        customer[2].setCustomerName("Jane3");
        customer[2].setCustomerAddress("xyz3");
    }

    public boolean updateCustomer(int customerId) {
        System.out.println("Updating a customer");
        return true;
    }

    public boolean deleteCustomer(int customerId) {
        System.out.println("Deleting a customer");
        return true;
    }

    public void listCustomer() {
        System.out.println("Listing all customers");

        for(Customer customer : customer){
            System.out.println("Details of customer--> " + customer.getCustomerId() + "---" + customer.getCustomerName() + "---" + customer.getCustomerAddress());
        }
    }
}
