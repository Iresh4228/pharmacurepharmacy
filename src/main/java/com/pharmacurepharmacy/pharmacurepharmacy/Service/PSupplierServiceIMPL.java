package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.PSupplier;
import com.pharmacurepharmacy.pharmacurepharmacy.Repository.PSupplierServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PSupplierServiceIMPL implements PSupplierService{


    @Autowired
    private PSupplierServiceRepo pSupplierServiceRepo;


    @Override
    public List<PSupplier> findAllPSuppliers() {
        return pSupplierServiceRepo.findAll();
    }

    @Override
    public PSupplier getPSuppliersById(int id) {
        PSupplier pSupplier = null;
        Optional<PSupplier> result  =pSupplierServiceRepo.findById(id);
        if (result.isPresent()){
            pSupplier = result.get();
        }else {
            throw new RuntimeException("Not Found !!!");
        }
        return pSupplier;
    }

    @Override
    public void deletePSuppliers(int id) {
            pSupplierServiceRepo.deleteById(id);
    }

    @Override
    public void addPSuppliers(PSupplier pSupplier) {
        pSupplierServiceRepo.save(pSupplier);

    }
}
