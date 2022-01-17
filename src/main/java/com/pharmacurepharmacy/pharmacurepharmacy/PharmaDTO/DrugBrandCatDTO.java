package com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO;

public class DrugBrandCatDTO {
    private Integer drugb_id;
    private String dbrandname;
    private Integer dcatid;
    private String dcatname;

    public DrugBrandCatDTO(Integer drugb_id, String dbrandname, Integer dcatid, String dcatname) {
        this.drugb_id = drugb_id;
        this.dbrandname = dbrandname;
        this.dcatid = dcatid;
        this.dcatname = dcatname;
    }

    public Integer getDbrandid() {
        return drugb_id;
    }

    public void setDbrandid(Integer drugb_id) {
        this.drugb_id = drugb_id;
    }

    public String getDbrandname() {
        return dbrandname;
    }

    public void setDbrandname(String dbrandname) {
        this.dbrandname = dbrandname;
    }

    public Integer getDcatid() {
        return dcatid;
    }

    public void setDcatid(Integer dcatid) {
        this.dcatid = dcatid;
    }

    public String getDcatname() {
        return dcatname;
    }

    public void setDcatname(String dcatname) {
        this.dcatname = dcatname;
    }
}
