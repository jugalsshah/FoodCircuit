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
//        System.out.println(s);
//        Customer cust = null;
       
//        Restaurantdetail r = snull;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            
            trns = session.beginTransaction();
            System.out.println(s+"sdsdsd");
            Criteria c= session.createCriteria(Restaurantdetail.class);
            c.add(Restrictions.eq("name", s));
            //cust = (Customer) query.uniqueResult();
//            System.out.println("detail");
           List<Restaurantdetail> list = c.list();
//            System.out.println("133");
            if (list.size() > 0) {
                System.out.println("555");
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
    }
    
