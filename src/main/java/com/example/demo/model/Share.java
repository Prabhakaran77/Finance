package com.example.demo.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SHARE")
public class Share {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="SID")
    private long id;

    private String S_name;
    private Date DOB;
    private int phone_num;
    private String type;
    private Date DOP;
    private int S_amt;
    private int per;
    private int no_of_shares;

    public Share() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getS_name() {
        return S_name;
    }

    public void setS_name(String s_name) {
        S_name = s_name;
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
        return S_amt;
    }

    public void setS_amt(int s_amt) {
        S_amt = s_amt;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public int getNo_of_shares() {
        return no_of_shares;
    }

    public void setNo_of_shares(int no_of_shares) {
        this.no_of_shares = no_of_shares;
    }
}