package com.pharmacurepharmacy.pharmacurepharmacy.Model;


import javax.persistence.*;

@Entity
public class POrders {

    @Id
    @Column(name="orderid")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int orderid;

    @Column(name="orderdrugid")
    private int orderdrugid;

    @Column(name="pharmacistid")
    private int pharmacistid;

    @Column(name="psupplierid")
    private int psupplierid;

    @Column(name="dorderdate")
    private String dorderdate;

    @Column(name="damount")
    private String damount;

    @Column(name="dstatus")
    private String dstatus;

    public POrders() {
    }

    public POrders(int orderid, int medId, int pharmacistId, int psupplierid, String dorderdate, String damount, String dstatus) {
        super();
        this.orderid = orderid;
        this.orderdrugid = medId;
        this.pharmacistid = pharmacistId;
        this.psupplierid = psupplierid;
        this.dorderdate = dorderdate;
        this.damount = damount;
        this.dstatus = dstatus;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getMedId() {
        return orderdrugid;
    }

    public void setMedId(int medId) {
        this.orderdrugid = medId;
    }

    public int getPharmacistId() {
        return pharmacistid;
    }

    public void setPharmacistId(int pharmacistId) {
        this.pharmacistid = pharmacistId;
    }

    public int getPsupplierid() {
        return psupplierid;
    }

    public void setPsupplierid(int psupplierid) {
        this.psupplierid = psupplierid;
    }

    public String getDorderdate() {
        return dorderdate;
    }

    public void setDorderdate(String dorderdate) {
        this.dorderdate = dorderdate;
    }

    public String getDamount() {
        return damount;
    }

    public void setDamount(String damount) {
        this.damount = damount;
    }

    public String getDstatus() {
        return dstatus;
    }

    public void setDstatus(String dstatus) {
        this.dstatus = dstatus;
    }

    @Override
    public String toString() {
        return "POrders{" +
                "orderid=" + orderid +
                ", medId=" + orderdrugid +
                ", pharmacistId=" + pharmacistid +
                ", psupplierid=" + psupplierid +
                ", dorderdate='" + dorderdate + '\'' +
                ", damount='" + damount + '\'' +
                ", dstatus='" + dstatus + '\'' +
                '}';
    }
}
