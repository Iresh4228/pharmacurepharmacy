package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.Pharmacist;

import java.util.List;

public interface PharmacistService {


    List<Pharmacist> findAllPharmacists();

    Pharmacist getPharmacistById(int pId);

    void deletePharmacist(int pId);

    void savePharmacist(Pharmacist pharmacist);
}
