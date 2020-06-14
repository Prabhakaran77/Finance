package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Partner")
public class Partner {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PID")
    private long id;
    private String name;
    private Date dob;
    private long ph_number;
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getPh_number() {
        return ph_number;
    }

    public void setPh_number(long ph_number) {
        this.ph_number = ph_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
