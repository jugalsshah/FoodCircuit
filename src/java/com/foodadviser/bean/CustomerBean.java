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
//import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;

/**
 *
 * @author jugalshah
 */
@ManagedBean(name = "customer")
public class CustomerBean {

//        @ManagedProperty(value="#{customerBo}")
    CustomerDaoImpl customerDaoImpl;
    List<Restaurantdetail> list;
 ReviewDaoImpl reviewDaoImpl;
    RestaurantdetailDaoImpl restaurantdetailDaoImpl;
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
        return customerDaoImpl.getCustomerIdByName(s);

    }
    
    
    //add review to database
     public String addReview(){
		reviewDaoImpl =new ReviewDaoImpl();
         
                Review review = new Review();
//                public void getIdbyName(String r)
//                List<Restaurantdetail> i=customerBean.getIdByName();
                System.out.println(restaurantdetailDaoImpl.getIdByName(this.getRestname())+"jugal");
                review.setRestaurantdetail((Restaurantdetail) restaurantdetailDaoImpl.getIdByName(this.getRestname()));
                System.out.println(customerDaoImpl.getCustomerIdByName(getEmailId())+"res");
                review.setCustomer((Customer) customerDaoImpl.getCustomerIdByName(getEmailId()));
                System.out.println(review+"cus");
		review.setReviewDetails(getDetail());
                
                
                System.out.println("hii111");
//		customerDaoImpl.addCustomer(cust);
		reviewDaoImpl.addReview(review);
		
		return "";
	}
    
    public List<Review> getAllReview(){
    
    reviewDaoImpl = new ReviewDaoImpl();
    return reviewDaoImpl.findAllReview();
    
    }
    
    public List<Restaurantdetail> getAlllist() {
        restaurantdetailDaoImpl = new  RestaurantdetailDaoImpl();
        list = restaurantdetailDaoImpl.findAlldetails();
        
        for(Restaurantdetail r:list){
        r.getName();
        }
//        list.add((Restaurantdetail) getDetailBo().findAlldetails());
        return list;
    }
    
    public List<Restaurantdetail> getIdByName(){
    
    restaurantdetailDaoImpl= new RestaurantdetailDaoImpl();
    String s=this.getRestname();
    return restaurantdetailDaoImpl.getIdByName(s);
    
    }
    //clear form values

    private void clearForm() {
        setName("");
        setAddress("");
    }
}
