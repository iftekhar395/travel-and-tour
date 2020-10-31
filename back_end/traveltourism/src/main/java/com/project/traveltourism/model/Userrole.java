package com.project.traveltourism.model;
// Generated Oct 29, 2020 2:28:11 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Userrole generated by hbm2java
 */
@Entity
@Table(name="userrole"
    ,catalog="travelandtourism"
)
public class Userrole  implements java.io.Serializable {


     private String emailid;
     private String password;
     private String role;
     private String status;

    public Userrole() {
    }

    public Userrole(String emailid, String password, String role, String status) {
       this.emailid = emailid;
       this.password = password;
       this.role = role;
       this.status = status;
    }
   
     @Id 

    
    @Column(name="emailid", unique=true, nullable=false, length=450)
    public String getEmailid() {
        return this.emailid;
    }
    
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    
    @Column(name="password", nullable=false, length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="role", nullable=false, length=45)
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    
    @Column(name="status", nullable=false, length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


