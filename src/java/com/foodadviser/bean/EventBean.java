/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodadviser.bean;

import com.foodadviser.dao.impl.EventDaoImpl;
import com.foodadviser.model.Event;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author jugalshah
 */
@ManagedBean(name = "event")
public class EventBean {
    
    EventDaoImpl eventDaoImpl;
    
    
    public int eventId;
     public String eventName;
     public String eventDetail;
     public String eventType;
     public String eventPlace;
     public Date startingTime;
     public Date endingTime;
     public Date startingDate;
     public Date endingDate;

    public Date getEndingDate() {
        return endingDate;
    }

    public Date getEndingTime() {
        return endingTime;
    }

    public EventDaoImpl getEventDaoImpl() {
        return eventDaoImpl;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public void setEndingTime(Date endingTime) {
        this.endingTime = endingTime;
    }

    public void setEventDaoImpl(EventDaoImpl eventDaoImpl) {
        this.eventDaoImpl = eventDaoImpl;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

   

    public String getEventDetail() {
        return eventDetail;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public String getEventType() {
        return eventType;
    }

   
    public Date getStartingTime() {
        return startingTime;
    }


    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }
     
     
     public void createEvet(){
     eventDaoImpl=new EventDaoImpl();
         Event event=new Event();
         
         event.setEndingDate(new Date());
event.setEndingTime(new Date());
event.setEventDetail(getEventDetail());
event.setEventName(getEventName());
event.setEventPlace(getEventPlace());
event.setEventType(getEventType());
event.setStartingDate(new Date());
event.setStartingTime(new Date());
         
     }
    
}
