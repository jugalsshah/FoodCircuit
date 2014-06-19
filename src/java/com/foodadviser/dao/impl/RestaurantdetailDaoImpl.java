/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.dao.RestaurantdetailDao;
import com.foodadviser.model.Customer;
import com.foodadviser.model.Restaurantdetail;
import com.foodadviser.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author jugalshah
 */
public class RestaurantdetailDaoImpl implements RestaurantdetailDao{

    @Override
    public List<Restaurantdetail> findAlldetails() {
             List<Restaurantdetail> rest = new ArrayList<Restaurantdetail>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
         try {
            trns = session.beginTransaction();
     rest=session.createQuery("from Restaurantdetail").list();
     
    }
          catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
    return rest;
}
    
    
    
    @Override
    public List<Restaurantdetail> getIdByName(String s) {

        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            
            trns = session.beginTransaction();
            Criteria c= session.createCriteria(Restaurantdetail.class);
            c.add(Restrictions.eq("name", s));
            //cust = (Customer) query.uniqueResult();
//            System.out.println("detail");
           List<Restaurantdetail> list = c.list();
//            System.out.println("133");
            if (list.size() > 0) {
            
                return list;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null ;
    }
    
    
    @Override
    public List<Restaurantdetail> getRestaurantNameById(int id){
    
    Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Criteria cr = session.createCriteria(Restaurantdetail.class);

            cr.add(Restrictions.eq("id", id));

//            cr.add(Restrictions.eqProperty("emailId","customerId"));
            List<Restaurantdetail> results = cr.list();
            if (results.size() > 0) {
    
                return results;
            } else {
                
                return results;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
//            System.out.println("sff");
            session.flush();
            session.close();
        }
        return null;


    }
    
    
    }
    
    
