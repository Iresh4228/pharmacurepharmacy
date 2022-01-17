package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.PSupplier;

import java.util.List;

public interface PSupplierService {

    List<PSupplier> findAllPSuppliers();

    PSupplier getPSuppliersById(int id);

    void deletePSuppliers(int id);

    void addPSuppliers(PSupplier pSupplier);
}
