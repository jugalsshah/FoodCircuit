/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.model.Customer;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jugalshah
 */
public class CustomerDaoImplTest {
    
    public CustomerDaoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCustomer method, of class CustomerDaoImpl.
//     */
//    @Test
//    public void testAddCustomer() {
//        System.out.println("addCustomer");
//        Customer customer = null;
//        CustomerDaoImpl instance = new CustomerDaoImpl();
//        instance.addCustomer(customer);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findAllCustomer method, of class CustomerDaoImpl.
     */
//    @Test
//    public void testFindAllCustomer() {
//        System.out.println("findAllCustomer");
//        CustomerDaoImpl instance = new CustomerDaoImpl();
//        List<Customer> expResult = null;
//        List<Customer> result = instance.findAllCustomer();
//        
//        for(Customer c:result){
//        
//            System.out.println(c.getEmailId()+"emI");
//        }
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of deleteCustomer method, of class CustomerDaoImpl.
     */
//    @Test
//    public void testDeleteCustomer() {
//        System.out.println("deleteCustomer");
//        int custid = 0;
//        CustomerDaoImpl instance = new CustomerDaoImpl();
//        instance.deleteCustomer(custid);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of updateCustomer method, of class CustomerDaoImpl.
     */
//    @Test
//    public void testUpdateCustomer() {
//        System.out.println("updateCustomer");
//        Customer cust = null;
//        CustomerDaoImpl instance = new CustomerDaoImpl();
//        instance.updateCustomer(cust);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
    /**
     * Test of getCustomerIdByName method, of class CustomerDaoImpl.
     */
//    @Test
//    public void testGetCustomerIdByName() {
//        System.out.println("getCustomerIdByName");
//        String name = "jugalsshah283@gmail.com";
//        CustomerDaoImpl instance = new CustomerDaoImpl();
//       
//        System.out.println("sdasdas");
//        List<Customer> result = instance.getCustomerIdByEmailId(name);
////        for (Iterator<Customer> it = result.iterator(); it.hasNext();) {
////            Customer c = it.next();
////            System.out.println(c.getCustomerId());
////        }
//        for(Customer s:result){
//        
//            System.out.println(s.getCustomerId()+"sdsd");
//        } 
//    }

    /**
     * Test of addCustomer method, of class CustomerDaoImpl.
     */
    
    /**
     * Test of getCustomerNamebyId method, of class CustomerDaoImpl.
     */
    @Test
    public void testGetCustomerNamebyId() {
        System.out.println("getCustomerNamebyId");
        Long customerid = 1L;
        CustomerDaoImpl instance = new CustomerDaoImpl();
        List expResult = null;
        List<Customer> result = instance.getCustomerNamebyId(customerid);
        for(Customer c:result){
            System.out.println("email"+ c.getEmailId());
        
        }
       
    }

    /**
     * Test of addCustomer method, of class CustomerDaoImpl.
   
    /**
     * Test of addCustomer method, of class CustomerDaoImpl.
     */
   
}