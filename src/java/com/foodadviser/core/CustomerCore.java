/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.core;

import com.foodadviser.model.Customer;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public interface CustomerCore {
    void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
    
}
