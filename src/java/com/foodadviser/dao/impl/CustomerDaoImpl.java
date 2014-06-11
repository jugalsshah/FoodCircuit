/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao.impl;

import com.foodadviser.dao.CustomerDao;
import com.foodadviser.model.Customer;
import com.foodadviser.util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author jugalshah
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void addCustomer(Customer customer) {

        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            customer.setCreatedDate(new Date());
            session.save(customer);
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
    public List<Customer> findAllCustomer() {

        List<Customer> cust = new ArrayList<Customer>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            System.out.println("11");
            trns = session.beginTransaction();
            System.out.println("22");
            cust = session.createQuery("from Customer").list();

        } catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
        return cust;
    }

    public void deleteCustomer(int custid) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Customer cust = (Customer) session.load(Customer.class, new Integer(custid));
            session.delete(cust);
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

    public void updateCustomer(Customer cust) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(cust);
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

    @Override
    public List<Customer> getCustomerIdByName(String name) {
        System.out.println(name + "jugllll");
//        Customer cust = null;
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
//            String queryString = "from Customer  where customerId = :emailId";
//            Query query = session.createQuery(queryString);
//            query.setString("emailId", name);
//             List<Customer> list = query.list();
//            System.out.println("456");
//            if (list.isEmpty()) {
//                System.out.println("hiii");
//                return list;
//            }
//            else{
//            return list;
//            }
            Criteria cr = session.createCriteria(Customer.class);
           
//            cr.setProjection(Projections.property("customerId"));
             cr.add(Restrictions.eq("emailId", name));
             
//            cr.add(Restrictions.eqProperty("emailId","customerId"));
            List<Customer> results = cr.list();
            if (results.size() > 0) {
                System.out.println("sds");
                return results;
            }
            else{
                System.out.println("sdjj");
            return results;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("sff");
            session.flush();
            session.close();
        }
        return null;
    }
}
