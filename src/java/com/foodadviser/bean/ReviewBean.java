///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.foodadviser.bean;
//
//import com.foodadviser.dao.impl.CustomerDaoImpl;
//import com.foodadviser.dao.impl.RestaurantdetailDaoImpl;
//import com.foodadviser.dao.impl.ReviewDaoImpl;
//import com.foodadviser.model.Customer;
//import com.foodadviser.model.Restaurantdetail;
//import com.foodadviser.model.Review;
//import java.util.List;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//
///**
// *
// * @author jugalshah
// */
//@ManagedBean(name = "review")
//public class ReviewBean {
//    
////    @ManagedProperty(value = "customerBean").
//    CustomerBean customerBean  = new CustomerBean();;
////    @ManagedProperty(value = "restaurantsDetailsBean")
//    RestaurantsDetailsBean restaurantsDetailsBean = new RestaurantsDetailsBean();;
//    ReviewDaoImpl reviewDaoImpl;
//    CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
//    RestaurantdetailDaoImpl restaurantdetailDaoImpl= new RestaurantdetailDaoImpl();
//    
//    public String detail;
//    public String restName;
//    public String Email;
//    
//
//    public CustomerBean getCustomerBean() {
//        return customerBean;
//    }
//
//    
//    public CustomerDaoImpl getCustomerDaoImpl() {
//        return customerDaoImpl;
//    }
//
//    public RestaurantdetailDaoImpl getRestaurantdetailDaoImpl() {
//        return restaurantdetailDaoImpl;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setEmail(String Email) {
//        this.Email = Email;
//    }
//
//    public String getRestName() {
//        return restName;
//    }
//
//    public void setRestName(String restName) {
//        this.restName = restName;
//    }
//
//    
//    public void setCustomerDaoImpl(CustomerDaoImpl customerDaoImpl) {
//        this.customerDaoImpl = customerDaoImpl;
//    }
//
//   
//    public void setRestaurantdetailDaoImpl(RestaurantdetailDaoImpl restaurantdetailDaoImpl) {
//        this.restaurantdetailDaoImpl = restaurantdetailDaoImpl;
//    }
//
//    
//    public ReviewDaoImpl getReviewDaoImpl() {
//        return reviewDaoImpl;
//    }
//
//    public void setReviewDaoImpl(ReviewDaoImpl reviewDaoImpl) {
//        this.reviewDaoImpl = reviewDaoImpl;
//    }
//
//    
//    public String getDetail() {
//        return detail;
//    }
//
//    public RestaurantsDetailsBean getRestaurantsDetailsBean() {
//        return restaurantsDetailsBean;
//    }
//
//    public void setCustomerBean(CustomerBean customerBean) {
//        this.customerBean = customerBean;
//    }
//
//    public void setDetail(String detail) {
//        this.detail = detail;
//    }
//
//    public void setRestaurantsDetailsBean(RestaurantsDetailsBean restaurantsDetailsBean) {
//        this.restaurantsDetailsBean = restaurantsDetailsBean;
//    }
//    
//    public String addReview(){
//		reviewDaoImpl =new ReviewDaoImpl();
//                
//                
//                
//                String name = restaurantsDetailsBean.getName();
//                System.out.println(name+"name"+restaurantsDetailsBean.name);
//                String EmailID = new String();
//                       EmailID=customerBean.getEmailId();
//                System.out.println(EmailID+"email"+customerBean.emailId);
//                Review review = new Review();
////                List<Restaurantdetail> i=restaurantdetailDaoImpl.getIdByName(name);
////                List<Customer> c= customerDaoImpl.getCustomerIdByName(EmailID);
//		Restaurantdetail r=(Restaurantdetail) restaurantdetailDaoImpl.getIdByName(name);
//                
//                r.getId();
//                review.setRestaurantdetail(r);
//                
//                
//                Customer c1=(Customer) customerDaoImpl.getCustomerIdByName(EmailID);
//                c1.getCustomerId();
//                review.setCustomer(c1);
//		review.setReviewDetails(getDetail());
//                
//                
//                System.out.println("hii111");
////		customerDaoImpl.addCustomer(cust);
//		reviewDaoImpl.addReview(review);
//		
//		return "";
//	}
//    
//    public List<Review> getAllReview(){
//    
//    reviewDaoImpl = new ReviewDaoImpl();
//    return reviewDaoImpl.findAllReview();
//    
//    }
//    
//}
