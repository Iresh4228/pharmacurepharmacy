package com.pharmacurepharmacy.pharmacurepharmacy.Model;


import javax.persistence.*;

@Entity
@Table(name = "drugcategory")
public class DCategory {

    @Id
    @Column(name = "drugcat_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer drugcat_id;

    @Column(name = "drugcat_name", length = 60, nullable = false)
    private String drugcat_name;

    public Integer getDrugcat_id() {
        return drugcat_id;
    }

    public void setDrugcat_id(Integer drugcat_id) {
        this.drugcat_id = drugcat_id;
    }

    public String getDrugcat_name() {
        return drugcat_name;
    }

    public void setDrugcat_name(String drugcat_name) {
        this.drugcat_name = drugcat_name;
    }
}
