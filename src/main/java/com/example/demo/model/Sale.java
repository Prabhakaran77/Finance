package com.example.demo.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "SALE")
public class Sale {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="SID")
    private long id;
    private int invoice;
    private String soldto;
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

    public String getSoldto() {
        return soldto;
    }

    public void setSoldto(String soldto) {
        this.soldto = soldto;
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

    public Long getAmt() {
        return amt;
    }

    public void setAmt(long amt) {
        this.amt = amt;
    }
}
