package com.pharmacurepharmacy.pharmacurepharmacy.Model;

import javax.persistence.*;

@Entity
@Table(name="pcustomer_login")
public class PCustomerLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="custloginid")
    private int custloginid;

    @Column(name="custloginemail")
    private String custloginemail;

    @Column(name="custpassword")
    private String custpassword;

    @Column(name="custstatus")
    private int custstatus;

    public int getCustloginid() {
        return custloginid;
    }

    public void setCustloginid(int custloginid) {
        this.custloginid = custloginid;
    }

    public String getCustloginemail() {
        return custloginemail;
    }

    public void setCustloginemail(String custloginemail) {
        this.custloginemail = custloginemail;
    }

    public String getCustpassword() {
        return custpassword;
    }

    public void setCustpassword(String custpassword) {
        this.custpassword = custpassword;
    }

    public int getCuststatus() {
        return custstatus;
    }

    public void setCuststatus(int custstatus) {
        this.custstatus = custstatus;
    }
}
