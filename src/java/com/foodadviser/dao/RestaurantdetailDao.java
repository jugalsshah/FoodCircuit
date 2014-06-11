/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao;

import com.foodadviser.model.Restaurantdetail;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public interface RestaurantdetailDao {
 
    List<Restaurantdetail> findAlldetails();
    List<Restaurantdetail> getIdByName(String string);
}
