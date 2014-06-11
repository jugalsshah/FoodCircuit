///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.foodadviser.bean;
//
//import com.foodadviser.dao.impl.RestaurantdetailDaoImpl;
//import com.foodadviser.model.Restaurantdetail;
////import com.mkyong.customer.model.Restaurantdetail;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//import javax.faces.bean.ManagedBean;
//
///**
// *
// * @author jugalshah
// */
//
//@ManagedBean(name = "rest")
//public class RestaurantsDetailsBean implements Serializable {
//
////    @Autowired
//    public int id;
//    public String name;
//    public String type;
//    List<Restaurantdetail> list;
//
//    RestaurantdetailDaoImpl restaurantdetailDaoImpl;
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public List<Restaurantdetail> getList() {
//        return list;
//    }
//
//    public void setList(List<Restaurantdetail> list) {
//        this.list = list;
//    }
//
//
//    public List<Restaurantdetail> getAlllist() {
//        restaurantdetailDaoImpl = new  RestaurantdetailDaoImpl();
//        list = restaurantdetailDaoImpl.findAlldetails();
//        
//        for(Restaurantdetail r:list){
//        r.getName();
//        }
////        list.add((Restaurantdetail) getDetailBo().findAlldetails());
//        return list;
//    }
//    
//    public List<Restaurantdetail> getIdByName(){
//    
//    restaurantdetailDaoImpl= new RestaurantdetailDaoImpl();
//    String s=this.getName();
//    return restaurantdetailDaoImpl.getIdByName(s);
//    
//    }
//}
