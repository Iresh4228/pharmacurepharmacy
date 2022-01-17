package com.pharmacurepharmacy.pharmacurepharmacy.Model;

import javax.persistence.*;

@Entity
@Table(name = "drugstocks")
public class DrugStock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "drugstkid")
    private Integer drugstkid;

    @OneToOne(targetEntity = PDrugs.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "drug_id", referencedColumnName = "drug_id")
    private PDrugs pDrugs;

    @Column(name = "manufactdate", nullable = false)
    private String manufactdate;

    @Column(name = "expirydate", nullable = false)
    private String expirydate;

    @Column(name = "dquantity", nullable = false)
    private  Integer dquantity;

    @Column(name =  "recdate", nullable = false)
    private String recdate;

    public Integer getDrugstkid() {
        return drugstkid;
    }

    public void setDrugstkid(Integer drugstkid) {
        this.drugstkid = drugstkid;
    }

    public PDrugs getpDrugs() {
        return pDrugs;
    }

    public void setpDrugs(PDrugs pDrugs) {
        this.pDrugs = pDrugs;
    }

    public String getManufactdate() {
        return manufactdate;
    }

    public void setManufactdate(String manufactdate) {
        this.manufactdate = manufactdate;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public Integer getDquantity() {
        return dquantity;
    }

    public void setDquantity(Integer dquantity) {
        this.dquantity = dquantity;
    }

    public String getRecdate() {
        return recdate;
    }

    public void setRecdate(String recdate) {
        this.recdate = recdate;
    }
}
