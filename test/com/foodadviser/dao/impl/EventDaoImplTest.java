/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.model.Event;
import java.sql.Time;
import java.util.Date;
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
public class EventDaoImplTest {
    
    public EventDaoImplTest() {
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
     * Test of retrieveEventById method, of class EventDaoImpl.
     */
//    @Test
//    public void testRetrieveEventById() {
//        System.out.println("retrieveEventById");
//        EventDaoImpl instance = new EventDaoImpl();
//        List expResult = null;
//        List result = instance.retrieveEventById();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of creareEvent method, of class EventDaoImpl.
     */
    @Test
    public void testCreareEvent() {
        System.out.println("creareEvent");
        Event event = new Event();
        EventDaoImpl instance = new EventDaoImpl();
//        event.setEndingDate(null);
//        event.setEndingTime(null);
        event.setEventDetail("learn hadoop in 1 day");
        event.setEventId(2L);
        event.setEventPlace("UTD");
        event.setEventType("private");
        event.setStartingDate(new Date());
        event.setEventName("learn hadoop");
//        event.setStartingTime(new Time(16, 16, 16));
        instance.creareEvent(event);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}