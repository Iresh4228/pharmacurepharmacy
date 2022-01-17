package com.pharmacurepharmacy.pharmacurepharmacy.Model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class PCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="custid")
    private int custid;

    @Column(name="custname")
    private String custname;

    @Column(name="custaddress")
    private String custaddress;

    @Column(name="custnic")
    private String custnic;

    @Column(name="custemail")
    private String custemail;

    @OneToOne(targetEntity = PCustomerLogin.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "custid", referencedColumnName = "custloginid")
    private PCustomerLogin pCustomerLogin;


    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    public String getCustnic() {
        return custnic;
    }

    public void setCustnic(String custnic) {
        this.custnic = custnic;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    public PCustomerLogin getpCustomerLogin() {
        return pCustomerLogin;
    }

    public void setpCustomerLogin(PCustomerLogin pCustomerLogin) {
        this.pCustomerLogin = pCustomerLogin;
    }

}
