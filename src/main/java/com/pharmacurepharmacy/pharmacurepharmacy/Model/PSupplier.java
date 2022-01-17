package com.pharmacurepharmacy.pharmacurepharmacy.Model;

import javax.persistence.*;

@Entity
@Table(name ="PSupplier")
public class PSupplier {

    @Id
    @Column(name ="PSupid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int PSupid;

    @Column(name="PSupname")
    private String PSupname;

    @Column(name="PSuplicense")
    private String PSuplicense;

    @Column(name="PSupaddress")
    private String PSupaddress;

    @Column(name="PSupemail")
    private String PSupemail;

    public PSupplier() {
    }

    public PSupplier(int PSupid, String PSupname, String PSuplicense, String PSupaddress, String PSupemail) {
        this.PSupid = PSupid;
        this.PSupname = PSupname;
        this.PSuplicense = PSuplicense;
        this.PSupaddress = PSupaddress;
        this.PSupemail = PSupemail;
    }

    public int getPSupid() {
        return PSupid;
    }

    public void setPSupid(int PSupid) {
        this.PSupid = PSupid;
    }

    public String getPSupname() {
        return PSupname;
    }

    public void setPSupname(String PSupname) {
        this.PSupname = PSupname;
    }

    public String getPSuplicense() {
        return PSuplicense;
    }

    public void setPSuplicense(String PSuplicense) {
        this.PSuplicense = PSuplicense;
    }

    public String getPSupaddress() {
        return PSupaddress;
    }

    public void setPSupaddress(String PSupaddress) {
        this.PSupaddress = PSupaddress;
    }

    public String getPSupemail() {
        return PSupemail;
    }

    public void setPSupemail(String PSupemail) {
        this.PSupemail = PSupemail;
    }

    @Override
    public String toString() {
        return "PSupplier{" +
                "PSupid=" + PSupid +
                ", PSupname='" + PSupname + '\'' +
                ", PSuplicense='" + PSuplicense + '\'' +
                ", PSupaddress='" + PSupaddress + '\'' +
                ", PSupemail='" + PSupemail + '\'' +
                '}';
    }
}
