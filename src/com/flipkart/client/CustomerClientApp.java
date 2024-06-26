package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;
import com.flipkart.business.CustomerInterface;

public class CustomerClientApp {
    public static void main(String[] args) {

        // client--> business --> bean
        //create business interface
//        CustomerBusiness service = new CustomerBusiness();
        CustomerInterface service = new CustomerBusiness();
        service.createCustomer();
//        System.out.println("Update Customer-->" + service.updateCustomer(101));
//        System.out.println("Delete Customer-->" + service.deleteCustomer(101));
        service.listCustomer();
    }
}
