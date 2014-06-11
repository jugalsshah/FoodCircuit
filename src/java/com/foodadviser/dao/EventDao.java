/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.dao;

import com.foodadviser.model.Event;
import java.util.List;

/**
 *
 * @author jugalshah
 */
public interface EventDao {
    public List<Event> retrieveEventById();
    
    void creareEvent(Event event);
}
