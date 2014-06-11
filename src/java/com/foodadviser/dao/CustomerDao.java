/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao;

import com.foodadviser.model.Customer;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public interface CustomerDao {
    
    
    void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
 List<Customer> getCustomerIdByName(String s);
}
