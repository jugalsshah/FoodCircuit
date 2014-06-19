/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.dao.EventDao;
import com.foodadviser.model.Customer;
import com.foodadviser.model.Event;
import com.foodadviser.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jugalshah
 */
public class EventDaoImpl implements EventDao{

    @Override
    public List<Event> retrieveEventById() {
        
        List<Event> event = new ArrayList<Event>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
         try {
             System.out.println("11");
            trns = session.beginTransaction();
             System.out.println("22");
     event=session.createQuery("from Event").list();
     
    }
          catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
    return event;
    }

    @Override
    public void creareEvent(Event event) {
         
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
           
            session.save(event);
           
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        
    }
    
}
