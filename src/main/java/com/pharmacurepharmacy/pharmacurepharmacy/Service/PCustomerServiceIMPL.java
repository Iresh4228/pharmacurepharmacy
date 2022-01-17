package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.PCustomer;
import com.pharmacurepharmacy.pharmacurepharmacy.Model.PCustomerLogin;
import com.pharmacurepharmacy.pharmacurepharmacy.Repository.PCustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PCustomerServiceIMPL implements PCustomerService{


    @Autowired
    private PCustomerRepo pCustomerRepo;

    @Override
    public void addCustomer(PCustomer pCustomer) {
        pCustomerRepo.save(pCustomer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        pCustomerRepo.deleteById(id);

    }

    @Override
    public Optional<PCustomer> customerUpdate(Integer id, PCustomer pCustomer) {
        return pCustomerRepo.findById(id).map(e ->{
            e.setCustname(pCustomer.getCustname());
            e.setCustemail(pCustomer.getCustemail());
            e.setCustaddress(pCustomer.getCustaddress());
            e.setCustnic(pCustomer.getCustnic());
            return e;
        });
    }

    @Override
    public List<PCustomer> getAllCustomers() {
        List<PCustomer> cust_list = new ArrayList<>();
        pCustomerRepo.findAll().forEach(cust_list::add);
        return cust_list;
    }

    @Override
    public PCustomer getCustomerByID(Integer id) {
        Optional<PCustomer> customer = Optional.ofNullable(
                pCustomerRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid User"))

        );
        PCustomer pCustomer = customer.get();
        return pCustomer;
    }

    @Override
    public PCustomerLogin checkCustomerLoginInfo(String custemail) {
        Optional<PCustomer> pCustomer = Optional.ofNullable(
                pCustomerRepo.findCustomerBycustemail(custemail).orElseThrow(() -> new IllegalArgumentException("Invalid Email"))

        );
        PCustomerLogin pCustomerLogin = pCustomer.get().getpCustomerLogin();
        return pCustomerLogin;
    }
}
