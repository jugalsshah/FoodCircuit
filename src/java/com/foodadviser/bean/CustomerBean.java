/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.bean;

import com.foodadviser.core.CustomerCore;
import com.foodadviser.core.impl.CustomerCoreImpl;
import com.foodadviser.dao.impl.CustomerDaoImpl;
import com.foodadviser.dao.impl.RestaurantdetailDaoImpl;
import com.foodadviser.dao.impl.ReviewDaoImpl;
import com.foodadviser.model.Customer;
import com.foodadviser.model.Restaurantdetail;
import com.foodadviser.model.Review;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.faces.bean.ManagedProperty;

/**
 *
 * @author jugalshah
 */
@ManagedBean(name = "customer")
@SessionScoped
public class CustomerBean implements Serializable{

//        @ManagedProperty(value="#{customerBo}")
    CustomerDaoImpl customerDaoImpl;
    List<Restaurantdetail> list;
    ReviewDaoImpl reviewDaoImpl;
    RestaurantdetailDaoImpl restaurantdetailDaoImpl;
    ArrayList arrayList = new ArrayList();
//	   CustomerCoreImpl customerCoreImpl;
    CustomerBean customerBean;
    public String name;
    public String address;
    public String emailId;
    public String password;
    public String detail;
    public String restname;
    public String type;

    public String getRestname() {
        return restname;
    }

    public void setRestname(String restname) {
        this.restname = restname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setCustomerDaoImpl(CustomerDaoImpl customerDaoImpl) {
        this.customerDaoImpl = customerDaoImpl;
    }

    public CustomerDaoImpl getCustomerDaoImpl() {
        return customerDaoImpl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //	public void setCustomerBo(CustomerBo customerBo) {
    //		this.customerBo = customerBo;
    //	}
    //get all customer data from database
    public List<Customer> getCustomerList() {
        customerDaoImpl = new CustomerDaoImpl();
        List<Customer> cust = new ArrayList<Customer>();
        return customerDaoImpl.findAllCustomer();
    }

    //add a new customer data into database
    public String addCustomer() {
        customerDaoImpl = new CustomerDaoImpl();
        Customer cust = new Customer();
        cust.setName(getName());
        cust.setAddress(getAddress());
        cust.setEmailId(getEmailId());
        cust.setPassword(getPassword());

        customerDaoImpl.addCustomer(cust);

        clearForm();

        return "";
    }

    ///get customer by id
    public List<Customer> getCustomerIdByName() {

        customerDaoImpl = new CustomerDaoImpl();
        String s = this.getEmailId();
        return customerDaoImpl.getCustomerIdByEmailId(s);

    }

    //add review to database
    public String addReview() {
        reviewDaoImpl = new ReviewDaoImpl();

        Review review = new Review();
        review.setReviewDetails(getDetail());
        System.out.println("hi");
        reviewDaoImpl.addReview(review, getEmailId(), getRestname());

        System.out.println(review + "hii2");
//		review.setReviewDetails(getDetail());


        return "";
    }

    public List<Review> getAllReview() {

        reviewDaoImpl = new ReviewDaoImpl();
        customerDaoImpl = new CustomerDaoImpl();
        List<Review> result = reviewDaoImpl.findAllReview();
//         for(Review r:result){
//        
//            System.out.println("details-->"+r.getReviewDetails());
//           arrayList.add(r);
//            System.out.println("customerid-->"+r.getCustomer());
//            List<Customer> l= customerDaoImpl.getCustomerNamebyId(r.getCustomer().getCustomerId());
//           for(Customer c:l){
//               System.out.println("name"+c.getName());
//           arrayList.add(c);
//           }
//           List<Restaurantdetail> k=restaurantdetailDaoImpl.getRestaurantNameById(r.getRestaurantdetail().getId());
//           for(Restaurantdetail r1:k){
//           
//               System.out.println("rest"+r1.getName());
//               arrayList.add(r1);
//           }
//           
//        }
       return result;
    }

    //clear form values
    private void clearForm() {
        setName("");
        setAddress("");
    }
}
