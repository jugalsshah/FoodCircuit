/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.dao.ReviewDao;
import com.foodadviser.model.Customer;
import com.foodadviser.model.Restaurantdetail;
import com.foodadviser.model.Review;
import com.foodadviser.util.HibernateUtil;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author jugalshah
 */
public class ReviewDaoImpl implements ReviewDao {

    CustomerDaoImpl customerDaoImpl;
    RestaurantdetailDaoImpl restaurantdetailDaoImpl;

    @Override
    public void addReview(Review review, String EmailId, String RestName) {
        Transaction trns = null;
        customerDaoImpl = new CustomerDaoImpl();
        restaurantdetailDaoImpl = new RestaurantdetailDaoImpl();

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            trns = session.beginTransaction();
            List<Customer> list = customerDaoImpl.getCustomerIdByEmailId(EmailId);
            for (Customer c : list) {
                Long id = c.getCustomerId();
                review.setCustomer(new Customer(id));
            }
            List<Restaurantdetail> li = restaurantdetailDaoImpl.getIdByName(RestName);
            for (Restaurantdetail r : li) {
                int i = r.getId();
                review.setRestaurantdetail(new Restaurantdetail(i));
            }

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

//        return null;

    }

    @Override
    public List<Review> findAllReview() {
        List<Review> review = new ArrayList<Review>();
        Transaction trns = null;
         customerDaoImpl = new CustomerDaoImpl();
        restaurantdetailDaoImpl = new RestaurantdetailDaoImpl();

        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            
            trns = session.beginTransaction();
            Criteria c=session.createCriteria(Review.class);
           
            review = c.list();
            

        } catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
        return review;
    }

    public List<Review> getReviewByName(String EmailId) {
        customerDaoImpl = new CustomerDaoImpl();
        List<Review> re = new ArrayList<Review>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            List<Customer> customers = customerDaoImpl.getCustomerIdByEmailId(EmailId);
            
            for (Customer c : customers) {
                Criteria cr = session.createCriteria(Review.class);
                Long l=c.getCustomerId();
                System.out.println("cusId" + c.getCustomerId());

                cr.add(Restrictions.eq("customer", new Customer(l)));
                re=cr.list();
               
            }
             
//            Criteria cr = session.createCriteria(Customer.class);



//            cr.add(Restrictions.eqProperty("emailId","customerId"));
//            List<Customer> results = cr.list();
//            if (results.size() > 0) {
//                System.out.println("sds");
//                return results;
//            }
//            else{
//                System.out.println("sdjj");
//            return results;
//            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("sff");
            session.flush();
            session.close();
        }
        return re;
//        return null;

    }
}
