package com.project.traveltourism.model;
// Generated Oct 29, 2020 2:28:11 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tourpackage generated by hbm2java
 */
@Entity
@Table(name="tourpackage"
    ,catalog="travelandtourism"
)
public class Tourpackage  implements java.io.Serializable {


     private Integer tpackid;
     private String tpackfrom;
     private String tpackto;
     private double tpackfare;
     private String packagetype;
     private String packageday;
     private String packdesc;
     private String packimg;

    public Tourpackage() {
    }

    public Tourpackage(String tpackfrom, String tpackto, double tpackfare, String packagetype, String packageday, String packdesc, String packimg) {
       this.tpackfrom = tpackfrom;
       this.tpackto = tpackto;
       this.tpackfare = tpackfare;
       this.packagetype = packagetype;
       this.packageday = packageday;
       this.packdesc = packdesc;
       this.packimg = packimg;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="tpackid", unique=true, nullable=false)
    public Integer getTpackid() {
        return this.tpackid;
    }
    
    public void setTpackid(Integer tpackid) {
        this.tpackid = tpackid;
    }

    
    @Column(name="tpackfrom", nullable=false, length=45)
    public String getTpackfrom() {
        return this.tpackfrom;
    }
    
    public void setTpackfrom(String tpackfrom) {
        this.tpackfrom = tpackfrom;
    }

    
    @Column(name="tpackto", nullable=false, length=45)
    public String getTpackto() {
        return this.tpackto;
    }
    
    public void setTpackto(String tpackto) {
        this.tpackto = tpackto;
    }

    
    @Column(name="tpackfare", nullable=false, precision=22, scale=0)
    public double getTpackfare() {
        return this.tpackfare;
    }
    
    public void setTpackfare(double tpackfare) {
        this.tpackfare = tpackfare;
    }

    
    @Column(name="packagetype", nullable=false, length=150)
    public String getPackagetype() {
        return this.packagetype;
    }
    
    public void setPackagetype(String packagetype) {
        this.packagetype = packagetype;
    }

    
    @Column(name="packageday", nullable=false, length=45)
    public String getPackageday() {
        return this.packageday;
    }
    
    public void setPackageday(String packageday) {
        this.packageday = packageday;
    }

    
    @Column(name="packdesc", nullable=false, length=450)
    public String getPackdesc() {
        return this.packdesc;
    }
    
    public void setPackdesc(String packdesc) {
        this.packdesc = packdesc;
    }

    
    @Column(name="packimg", nullable=false, length=450)
    public String getPackimg() {
        return this.packimg;
    }
    
    public void setPackimg(String packimg) {
        this.packimg = packimg;
    }




}


