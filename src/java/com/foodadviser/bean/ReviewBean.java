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
////    CustomerBean customerBean  = new CustomerBean();;
////    @ManagedProperty(value = "restaurantsDetailsBean")
////    RestaurantsDetailsBean restaurantsDetailsBean;
//    ReviewDaoImpl reviewDaoImpl;
//    CustomerDaoImpl customerDaoImpl;
//    RestaurantdetailDaoImpl restaurantdetailDaoImpl;
//    
//    public String detail;
//    public String restName;
//    public String Email;
//    List<Review> list;
//    List<Customer> custList;
//    List<Restaurantdetail> restaurantdetailsList;
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
//    public void setDetail(String detail) {
//        this.detail = detail;
//    }
//    
//    
//    public List<Review> getAllReview(){
//    
//    reviewDaoImpl = new ReviewDaoImpl();
//    return reviewDaoImpl.findAllReview();
//    
//    }
//    
//}
