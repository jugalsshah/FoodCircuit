/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.core;

import com.foodadviser.model.Restaurantdetail;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public interface RestaurantdetailCore {
    
     List<Restaurantdetail> findAlldetails();
}
