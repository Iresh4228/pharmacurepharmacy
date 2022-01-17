package com.pharmacurepharmacy.pharmacurepharmacy.Repository;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.PCustomer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PCustomerRepo extends CrudRepository<PCustomer, Integer> {


    Optional<PCustomer> findCustomerBycustemail(String custemail);
}
