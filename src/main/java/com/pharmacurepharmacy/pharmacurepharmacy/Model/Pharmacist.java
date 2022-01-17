package com.pharmacurepharmacy.pharmacurepharmacy.Model;


import javax.persistence.*;

@Entity
@Table(name="Pharmacist")
public class Pharmacist {

    @Id
    @Column(name="Pid")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Pid;

    @Column(name="Pname")
    private String Pname;

    @Column(name="Paddress")
    private String Paddress;

    @Column(name="Pemail")
    private String Pemail;

    @Column(name="Pregnumber")
    private String Pregnumber;

    public Pharmacist() {
    }

    public Pharmacist(int pid, String pname, String paddress, String pemail, String pregnumber) {
        super();
        this.Pid = pid;
        this.Pname = pname;
        this.Paddress = paddress;
        this.Pemail = pemail;
        this.Pregnumber = pregnumber;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getPaddress() {
        return Paddress;
    }

    public void setPaddress(String paddress) {
        Paddress = paddress;
    }

    public String getPemail() {
        return Pemail;
    }

    public void setPemail(String pemail) {
        Pemail = pemail;
    }

    public String getPregnumber() {
        return Pregnumber;
    }

    public void setPregnumber(String pregnumber) {
        Pregnumber = pregnumber;
    }

    @Override
    public String toString() {
        return "Pharmacist{" +
                "Pid=" + Pid +
                ", Pname='" + Pname + '\'' +
                ", Paddress='" + Paddress + '\'' +
                ", Pemail='" + Pemail + '\'' +
                ", Pregnumber='" + Pregnumber + '\'' +
                '}';
    }
}
