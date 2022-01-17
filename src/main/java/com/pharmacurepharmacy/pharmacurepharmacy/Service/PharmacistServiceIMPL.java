package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.Pharmacist;
import com.pharmacurepharmacy.pharmacurepharmacy.Repository.PharmacistServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacistServiceIMPL implements PharmacistService{

    private PharmacistServiceRepo pharmacistServiceRepo;

    @Autowired
    public PharmacistServiceIMPL(PharmacistServiceRepo pharmacistServiceRepo){
        this.pharmacistServiceRepo = pharmacistServiceRepo;
    }


    @Override
    public List<Pharmacist> findAllPharmacists() {
        return null;
    }

    @Override
    public Pharmacist getPharmacistById(int pId) {
        return null;
    }

    @Override
    public void deletePharmacist(int pId) {

    }

    @Override
    public void savePharmacist(Pharmacist pharmacist) {

    }
}
