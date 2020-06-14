package com.example.demo.model;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name="Vendor")
public class Vendor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="VID")
    private long id;
    private String name;
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
