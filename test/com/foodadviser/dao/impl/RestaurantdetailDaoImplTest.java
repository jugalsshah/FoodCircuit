/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.model.Restaurantdetail;
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
public class RestaurantdetailDaoImplTest {
    
    public RestaurantdetailDaoImplTest() {
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
     * Test of findAlldetails method, of class RestaurantdetailDaoImpl.
     */
//    @Test
//    public void testFindAlldetails() {
//        System.out.println("findAlldetails");
//        RestaurantdetailDaoImpl instance = new RestaurantdetailDaoImpl();
////        List<> expResult = null;
//        List<Restaurantdetail> result = instance.findAlldetails();
////        assertEquals(expResult, result);
//        for(Restaurantdetail r:result){
//            System.out.println("detail"+""+r.getName());
//            System.out.println("detail"+""+r.getType());
//        }
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of getIdByName method, of class RestaurantdetailDaoImpl.
     */
//    @Test
//    public void testGetIdByName() {
//        System.out.println("getIdByName");
//        String s = "Subway";
//        RestaurantdetailDaoImpl instance = new RestaurantdetailDaoImpl();
////        List expResult = null;
//        List<Restaurantdetail> result = instance.getIdByName(s);
////        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//        for(Restaurantdetail r:result){
//            System.out.println(r.getId()+"jugsl");
//        
//        }
//    }


    /**
     * Test of getRestaurantNameById method, of class RestaurantdetailDaoImpl.
     */
    @Test
    public void testGetRestaurantNameById() {
        System.out.println("getRestaurantNameById");
        int id = 5;
        RestaurantdetailDaoImpl instance = new RestaurantdetailDaoImpl();
        List expResult = null;
        List<Restaurantdetail> result = instance.getRestaurantNameById(id);
        for(Restaurantdetail r:result){
        
            System.out.println("name"+r.getName());
        }
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of findAlldetails method, of class RestaurantdetailDaoImpl.
     */
//    @Test
//    public void testFindAlldetails() {
//        System.out.println("findAlldetails");
//        RestaurantdetailDaoImpl instance = new RestaurantdetailDaoImpl();
//        List expResult = null;
//        List result = instance.findAlldetails();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}