package com.pharmacurepharmacy.pharmacurepharmacy.Service;


import com.pharmacurepharmacy.pharmacurepharmacy.Model.PDrugs;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.pDrugsDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.Repository.PDrugsServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PDrugsServiceIMPL implements PDrugsService{

    @Autowired
    private PDrugsServiceRepo pDrugsServiceRepo;

    @Override
    public void saveDrug(PDrugs pDrugs) {
        pDrugsServiceRepo.save(pDrugs);
    }

    @Override
    public List<PDrugs> getAllDrugs() {
        List<PDrugs> drugLists = new ArrayList<>();
        pDrugsServiceRepo.findAll().forEach(drugLists::add);
        return drugLists;
    }

    @Override
    public Optional<PDrugs> updateDrug(Integer id, PDrugs pDrugs) {
        return pDrugsServiceRepo.findById(id).map(e->{
            e.setDrug_name(pDrugs.getDrug_name());
            e.setDrugprice(pDrugs.getDrugprice());
            e.setDrugqty(pDrugs.getDrugqty());
            return e;
        });
    }

    @Override
    public void deleteDrug(Integer id) {
        pDrugsServiceRepo.deleteById(id);
    }

    @Override
    public List<pDrugsDTO> getAllByNames() {
        List<pDrugsDTO> drugLists = new ArrayList<>();
        pDrugsServiceRepo.getAllDrugDetailsById().forEach(drugLists::add);
        return drugLists;
    }

    @Override
    public PDrugs getByID(Integer id) {
        Optional<PDrugs> drugs = Optional.ofNullable(
                pDrugsServiceRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id"))

        );
        PDrugs pDrugs = drugs.get();
        return pDrugs;
    }
}
