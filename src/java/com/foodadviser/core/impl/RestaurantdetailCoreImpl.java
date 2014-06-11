/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.core.impl;

import com.foodadviser.core.RestaurantdetailCore;
import com.foodadviser.dao.RestaurantdetailDao;
import com.foodadviser.model.Restaurantdetail;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public class RestaurantdetailCoreImpl implements RestaurantdetailCore{

    RestaurantdetailDao restaurantdetailDao;
    @Override
    public List<Restaurantdetail> findAlldetails() {
        return restaurantdetailDao.findAlldetails();
    }
    
}
