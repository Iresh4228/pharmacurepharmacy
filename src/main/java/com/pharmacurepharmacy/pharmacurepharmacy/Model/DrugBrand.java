package com.pharmacurepharmacy.pharmacurepharmacy.Model;

import javax.persistence.*;

@Entity
@Table(name = "d_brand")
public class DrugBrand {

    @Id
    @Column(name = "drugb_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer drugb_id;

    @Column(name = "drugb_name", length = 45, nullable = false)
    private String drugb_name;

    @OneToOne(targetEntity = DCategory.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "drugcat_id", referencedColumnName = "drugcat_id")
    private DCategory dCategory;

    public Integer getDrugb_id() {
        return drugb_id;
    }

    public void setDrugb_id(Integer drugb_id) {
        this.drugb_id = drugb_id;
    }

    public String getDrugb_name() {
        return drugb_name;
    }

    public void setDrugb_name(String drugb_name) {
        this.drugb_name = drugb_name;
    }

    public DCategory getdCategory() {
        return dCategory;
    }

    public void setdCategory(DCategory dCategory) {
        this.dCategory = dCategory;
    }
}
