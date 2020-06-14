package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "PURCHASE")
public class Purchase {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PID")
    private long id;
    private int invoice;
    private String purchaseFrom;
    private LocalDate date;
    private String goods;
    private Long amt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    public String getPurchaseFrom() {
        return purchaseFrom;
    }

    public void setPurchaseFrom(String purchaseFrom) {
        this.purchaseFrom = purchaseFrom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public long getamt() {
        return amt;
    }

    public void setamt(Long amt) {
        this.amt = amt;
    }
}
