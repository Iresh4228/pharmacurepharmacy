package com.pharmacurepharmacy.pharmacurepharmacy.Model;


import javax.persistence.*;

@Entity
@Table(name="drugs")
public class PDrugs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "drug_id")
    private Integer drug_id;

    @OneToOne(targetEntity = DrugBrand.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "drugb_id", referencedColumnName = "drugb_id")
    private DrugBrand drugBrand;

    @OneToOne(targetEntity = DCategory.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "drugcat_id", referencedColumnName = "drugcat_id")
    private DCategory dCategory;

//    @OneToOne(targetEntity = Rack.class, fetch = FetchType.LAZY)
//    @JoinColumn(name = "rack_no", referencedColumnName = "rack_no")
//    private Rack rack;
//
//    @OneToOne(targetEntity = Supplier.class, fetch = FetchType.LAZY)
//    @JoinColumn(name = "sup_id", referencedColumnName = "sup_id")
//    private Supplier supplier;

    @Column(name = "drug_name", nullable = false)
    private String drug_name;

    @Column(name = "drugqty", nullable = false)
    private  Integer drugqty;

    @Column(name = "drugprice", nullable = false)
    private Float drugprice;

    public Integer getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(Integer drug_id) {
        this.drug_id = drug_id;
    }

    public DrugBrand getDrugBrand() {
        return drugBrand;
    }

    public void setDrugBrand(DrugBrand drugBrand) {
        this.drugBrand = drugBrand;
    }

    public DCategory getdCategory() {
        return dCategory;
    }

    public void setdCategory(DCategory dCategory) {
        this.dCategory = dCategory;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public Integer getDrugqty() {
        return drugqty;
    }

    public void setDrugqty(Integer drugqty) {
        this.drugqty = drugqty;
    }

    public Float getDrugprice() {
        return drugprice;
    }

    public void setDrugprice(Float drugprice) {
        this.drugprice = drugprice;
    }
}
