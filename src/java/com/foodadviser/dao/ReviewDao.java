/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao;

import com.foodadviser.model.Review;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public interface ReviewDao {
    
    public void addReview(Review review, String EmailId, String RestName);
 
	List<Review> findAllReview();
 
    
}
