/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.model.Customer;
import com.foodadviser.model.Restaurantdetail;
import com.foodadviser.model.Review;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jugalshah
 */
public class ReviewDaoImplTest {
    
    public ReviewDaoImplTest() {
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
     * Test of addReview method, of class ReviewDaoImpl.
     */
    @Test
    public void testAddReview() {
        System.out.println("addReview");
        Review review = null;
        ReviewDaoImpl instance = new ReviewDaoImpl();
        RestaurantdetailDaoImpl restaurantdetailDaoImpl = new RestaurantdetailDaoImpl();
        CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
        String s= "jugalsshah283@gmail.com";
        String ss1="Subway";
        List<Restaurantdetail> list= restaurantdetailDaoImpl.getIdByName(ss1);
        List<Customer> li= customerDaoImpl.getCustomerIdByName(s);
        review.setReviewDetails("dsdsd");
        
      for(Restaurantdetail r:list){
          
             review.setRestaurantdetail(r);
      }
      for(Customer c:li){
      
          review.setCustomer(c);
      }
        instance.addReview(review);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllReview method, of class ReviewDaoImpl.
     */
//    @Test
//    public void testFindAllReview() {
//        System.out.println("findAllReview");
//        ReviewDaoImpl instance = new ReviewDaoImpl();
//        List expResult = null;
//        List result = instance.findAllReview();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}