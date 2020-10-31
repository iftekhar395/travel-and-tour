package com.project.traveltourism.model;
// Generated Oct 29, 2020 2:28:11 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Custbookinghotel generated by hbm2java
 */
@Entity
@Table(name="custbookinghotel"
    ,catalog="travelandtourism"
)
public class Custbookinghotel  implements java.io.Serializable {


     private Integer bookingid;
     private int hdetid;
     private int totalroom;
     private double subtotal;
     private int busid;
     private String paystatus;

    public Custbookinghotel() {
    }

    public Custbookinghotel(int hdetid, int totalroom, double subtotal, int busid, String paystatus) {
       this.hdetid = hdetid;
       this.totalroom = totalroom;
       this.subtotal = subtotal;
       this.busid = busid;
       this.paystatus = paystatus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="bookingid", unique=true, nullable=false)
    public Integer getBookingid() {
        return this.bookingid;
    }
    
    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    
    @Column(name="hdetid", nullable=false)
    public int getHdetid() {
        return this.hdetid;
    }
    
    public void setHdetid(int hdetid) {
        this.hdetid = hdetid;
    }

    
    @Column(name="totalroom", nullable=false)
    public int getTotalroom() {
        return this.totalroom;
    }
    
    public void setTotalroom(int totalroom) {
        this.totalroom = totalroom;
    }

    
    @Column(name="subtotal", nullable=false, precision=22, scale=0)
    public double getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    
    @Column(name="busid", nullable=false)
    public int getBusid() {
        return this.busid;
    }
    
    public void setBusid(int busid) {
        this.busid = busid;
    }

    
    @Column(name="paystatus", nullable=false, length=45)
    public String getPaystatus() {
        return this.paystatus;
    }
    
    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }




}


