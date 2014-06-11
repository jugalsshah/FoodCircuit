/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.core.impl;

import com.foodadviser.core.CustomerCore;
import com.foodadviser.dao.CustomerDao;
import com.foodadviser.model.Customer;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public class CustomerCoreImpl implements CustomerCore{
    CustomerDao customerDao;
    
    
    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }
    
}
