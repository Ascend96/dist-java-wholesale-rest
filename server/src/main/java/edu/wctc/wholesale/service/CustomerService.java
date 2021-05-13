package edu.wctc.wholesale.service;

import edu.wctc.wholesale.ResourceNotFoundException;
import edu.wctc.wholesale.entity.Customer;

import java.util.List;

public interface CustomerService  {
//    List<Customer> getAllCustomers();
    Customer getCustomer(int id) throws ResourceNotFoundException;

}
