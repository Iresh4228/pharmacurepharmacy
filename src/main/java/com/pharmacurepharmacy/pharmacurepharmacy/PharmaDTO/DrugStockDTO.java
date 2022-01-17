package com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO;

public class DrugStockDTO {

    private Integer drugstkid;
    private Integer pdrugid;
    private String pdrugname;
    private String manufactdate;
    private String expirydate;
    private Integer dquantity;
    private String recdate;
    private Float drugprice;

    public DrugStockDTO(Integer drugstkid, Integer pdrugid, String pdrugname, String manufactdate, String expirydate, Integer dquantity, String recdate, Float drugprice) {
        this.drugstkid = drugstkid;
        this.pdrugid = pdrugid;
        this.pdrugname = pdrugname;
        this.manufactdate = manufactdate;
        this.expirydate = expirydate;
        this.dquantity = dquantity;
        this.recdate = recdate;
        this.drugprice = drugprice;
    }

    public Integer getDrugstkid() {
        return drugstkid;
    }

    public void setDrugstkid(Integer drugstkid) {
        this.drugstkid = drugstkid;
    }

    public Integer getPdrugid() {
        return pdrugid;
    }

    public void setPdrugid(Integer pdrugid) {
        this.pdrugid = pdrugid;
    }

    public String getPdrugname() {
        return pdrugname;
    }

    public void setPdrugname(String pdrugname) {
        this.pdrugname = pdrugname;
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

    public Float getDrugprice() {
        return drugprice;
    }

    public void setDrugprice(Float drugprice) {
        this.drugprice = drugprice;
    }
}
