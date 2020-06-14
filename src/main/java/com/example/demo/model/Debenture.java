package com.example.demo.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DEBENTURE")
public class Debenture {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="DID")
    private long id;

    private String D_name;
    private Date DOB;
    private int phone_num;
    private String type;
    private Date DOP;
    private int D_amt;
    private int per;
    public Debenture() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getS_name() {
        return D_name;
    }

    public void setS_name(String s_name) {
        D_name = s_name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public int getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDOP() {
        return DOP;
    }

    public void setDOP(Date DOP) {
        this.DOP = DOP;
    }

    public int getS_amt() {
        return D_amt;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }
}