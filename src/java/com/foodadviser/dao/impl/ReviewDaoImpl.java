/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.dao.ReviewDao;
import com.foodadviser.model.Review;
import com.foodadviser.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author jugalshah
 */
public class ReviewDaoImpl implements ReviewDao{

    @Override
    public void addReview(Review review) {
       Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            System.out.println("hiii1");
            session.save(review);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.setFlushMode(FlushMode.AUTO);
            session.close();
        }
        
    }

    @Override
    public List<Review> findAllReview() {
        List<Review> review = new ArrayList<Review>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
         try {
             System.out.println("11");
            trns = session.beginTransaction();
             System.out.println("22");
     review=session.createQuery("from Review").list();
     
    }
          catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
    return review;
    }

     
    
    
}
