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
//    @Test
//    public void testAddReview() {
//        System.out.println("addReview");
//        Review review = new Review();
//        String EmailId = "jugal.sk.shah@gmail.com";
//        String RestName = "Subway";
//        ReviewDaoImpl instance = new ReviewDaoImpl();
//        Long expResult = null;
//        
//        review.setReviewDetails(RestName);
//        review.setReviewId(3);
//        instance.addReview(review, EmailId, RestName);
////        assertEquals(expResult, result);
////        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of findAllReview method, of class ReviewDaoImpl.
     */
   
    
    @Test
    public void testFindAllReview() {
        System.out.println("findAllReview");
        ReviewDaoImpl instance = new ReviewDaoImpl();
        List expResult = null;
        List <Review> result = instance.findAllReview();
CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
RestaurantdetailDaoImpl restaurantdetailDaoImpl= new RestaurantdetailDaoImpl();
        for(Review r:result){
        
            
//            System.out.println("customerid-->"+r.getCustomer());
            List<Customer> l= customerDaoImpl.getCustomerNamebyId(r.getCustomer().getCustomerId());
           for(Customer c:l){
               System.out.println("name-->"+c.getName());
           
           }
           System.out.println("details-->"+r.getReviewDetails());
           List<Restaurantdetail> k=restaurantdetailDaoImpl.getRestaurantNameById(r.getRestaurantdetail().getId());
           for(Restaurantdetail r1:k){
           
               System.out.println("rest-->"+r1.getName());
           }
        }
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    
    /**
     * Test of getReviewByName method, of class ReviewDaoImpl.
//     */
//    @Test
//    public void testGetReviewByName() {
//        System.out.println("getReviewByName");
//        String EmailId = "jugalsshah283@gmail.com";
//        ReviewDaoImpl instance = new ReviewDaoImpl();
////        List expResult = null;
//        List<Review> result = instance.getReviewByName(EmailId);
//       for(Review r:result){
//           System.out.println("custreview"+ r.getReviewDetails());
//       }
//        
//        
//    }

   
    /**
     * Test of findAllReview method, of class ReviewDaoImpl.
     */
   
}