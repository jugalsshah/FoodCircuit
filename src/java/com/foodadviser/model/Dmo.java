///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.foodadviser.model;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;
//
///**
// *
// * @author jugalshah
// */
//@Entity
//@Table(catalog = "test", schema = "")
////@XmlRootElement
////@NamedQueries({
////    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e"),
////    @NamedQuery(name = "Event.findByEventId", query = "SELECT e FROM Event e WHERE e.eventId = :eventId"),
////    @NamedQuery(name = "Event.findByEventName", query = "SELECT e FROM Event e WHERE e.eventName = :eventName"),
////    @NamedQuery(name = "Event.findByEventDetail", query = "SELECT e FROM Event e WHERE e.eventDetail = :eventDetail"),
////    @NamedQuery(name = "Event.findByEventType", query = "SELECT e FROM Event e WHERE e.eventType = :eventType"),
////    @NamedQuery(name = "Event.findByEventPlace", query = "SELECT e FROM Event e WHERE e.eventPlace = :eventPlace"),
////    @NamedQuery(name = "Event.findByStartingTime", query = "SELECT e FROM Event e WHERE e.startingTime = :startingTime"),
////    @NamedQuery(name = "Event.findByEndingTime", query = "SELECT e FROM Event e WHERE e.endingTime = :endingTime"),
////    @NamedQuery(name = "Event.findByStartingDate", query = "SELECT e FROM Event e WHERE e.startingDate = :startingDate"),
////    @NamedQuery(name = "Event.findByEndingDate", query = "SELECT e FROM Event e WHERE e.endingDate = :endingDate"),
////    @NamedQuery(name = "Event.findByImage", query = "SELECT e FROM Event e WHERE e.image = :image")})
//public class Event implements Serializable {
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "EVENT_ID", nullable = false)
//    private Long eventId;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 45)
//    @Column(name = "EVENT_NAME", nullable = false, length = 45)
//    private String eventName;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 45)
//    @Column(name = "EVENT_DETAIL", nullable = false, length = 45)
//    private String eventDetail;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 45)
//    @Column(name = "EVENT_TYPE", nullable = false, length = 45)
//    private String eventType;
//    @Basic(optional = false)
//    @NotNull
//    @Size(min = 1, max = 45)
//    @Column(name = "EVENT_PLACE", nullable = false, length = 45)
//    private String eventPlace;
//    @Column(name = "STARTING_TIME")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date startingTime;
//    @Column(name = "ENDING_TIME")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date endingTime;
//    @Column(name = "STARTING_DATE")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date startingDate;
//    @Column(name = "ENDING_DATE")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date endingDate;
//    @Size(max = 45)
//    @Column(length = 45)
//    private String image;
//
//    public Event() {
//    }
//
//    public Event(Long eventId) {
//        this.eventId = eventId;
//    }
//
//    public Event(Long eventId, String eventName, String eventDetail, String eventType, String eventPlace) {
//        this.eventId = eventId;
//        this.eventName = eventName;
//        this.eventDetail = eventDetail;
//        this.eventType = eventType;
//        this.eventPlace = eventPlace;
//    }
//
//    public Long getEventId() {
//        return eventId;
//    }
//
//    public void setEventId(Long eventId) {
//        this.eventId = eventId;
//    }
//
//    public String getEventName() {
//        return eventName;
//    }
//
//    public void setEventName(String eventName) {
//        this.eventName = eventName;
//    }
//
//    public String getEventDetail() {
//        return eventDetail;
//    }
//
//    public void setEventDetail(String eventDetail) {
//        this.eventDetail = eventDetail;
//    }
//
//    public String getEventType() {
//        return eventType;
//    }
//
//    public void setEventType(String eventType) {
//        this.eventType = eventType;
//    }
//
//    public String getEventPlace() {
//        return eventPlace;
//    }
//
//    public void setEventPlace(String eventPlace) {
//        this.eventPlace = eventPlace;
//    }
//
//    public Date getStartingTime() {
//        return startingTime;
//    }
//
//    public void setStartingTime(Date startingTime) {
//        this.startingTime = startingTime;
//    }
//
//    public Date getEndingTime() {
//        return endingTime;
//    }
//
//    public void setEndingTime(Date endingTime) {
//        this.endingTime = endingTime;
//    }
//
//    public Date getStartingDate() {
//        return startingDate;
//    }
//
//    public void setStartingDate(Date startingDate) {
//        this.startingDate = startingDate;
//    }
//
//    public Date getEndingDate() {
//        return endingDate;
//    }
//
//    public void setEndingDate(Date endingDate) {
//        this.endingDate = endingDate;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (eventId != null ? eventId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Event)) {
//            return false;
//        }
//        Event other = (Event) object;
//        if ((this.eventId == null && other.eventId != null) || (this.eventId != null && !this.eventId.equals(other.eventId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.foodadviser.model.Event[ eventId=" + eventId + " ]";
//    }
//    
//}
