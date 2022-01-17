package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.PCustomer;
import com.pharmacurepharmacy.pharmacurepharmacy.Model.PCustomerLogin;

import java.util.List;
import java.util.Optional;

public interface PCustomerService {
    void addCustomer(PCustomer pCustomer);

    void deleteCustomer(Integer id);

    Optional<PCustomer> customerUpdate(Integer id, PCustomer pCustomer);

    List<PCustomer> getAllCustomers();

    PCustomer getCustomerByID(Integer id);

    PCustomerLogin checkCustomerLoginInfo(String custemail);
}
