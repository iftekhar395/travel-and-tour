package com.project.traveltourism.model;
// Generated Oct 29, 2020 2:28:11 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Busbooking generated by hbm2java
 */
@Entity
@Table(name="busbooking"
    ,catalog="travelandtourism"
)
public class Busbooking {


     private Integer busbookid;
     private int busid;
     private int custid;
     private Date bookingdate;
     private int seatqty;

    public Busbooking() {
    }

    public Busbooking(int busid, int custid, Date bookingdate, int seatqty) {
       this.busid = busid;
       this.custid = custid;
       this.bookingdate = bookingdate;
       this.seatqty = seatqty;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="busbookid", unique=true, nullable=false)
    public Integer getBusbookid() {
        return this.busbookid;
    }
    
    public void setBusbookid(Integer busbookid) {
        this.busbookid = busbookid;
    }

    
    @Column(name="busid", nullable=false)
    public int getBusid() {
        return this.busid;
    }
    
    public void setBusid(int busid) {
        this.busid = busid;
    }

    
    @Column(name="custid", nullable=false)
    public int getCustid() {
        return this.custid;
    }
    
    public void setCustid(int custid) {
        this.custid = custid;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="bookingdate", nullable=false, length=10)
    public Date getBookingdate() {
        return this.bookingdate;
    }
    
    public void setBookingdate(Date bookingdate) {
        this.bookingdate = bookingdate;
    }

    
    @Column(name="seatqty", nullable=false)
    public int getSeatqty() {
        return this.seatqty;
    }
    
    public void setSeatqty(int seatqty) {
        this.seatqty = seatqty;
    }




}


