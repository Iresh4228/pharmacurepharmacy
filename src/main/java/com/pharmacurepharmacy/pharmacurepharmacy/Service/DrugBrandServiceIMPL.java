package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DCategory;
import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugBrand;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugBrandCatDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugBrandCatDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.Repository.DrugBrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DrugBrandServiceIMPL implements DrugBrandService{

    @Autowired
    private DrugBrandRepo drugBrandRepo;
    @Override
    public void saveDrugBrand(DrugBrand drugBrand) {
        drugBrandRepo.save(drugBrand);
    }

    @Override
    public List<DrugBrand> getAllDrugBrands() {
        List drugBList = new ArrayList();
        drugBrandRepo.findAll().forEach(drugBList::add);
        return drugBList;
    }

    @Override
    @Transactional
    public Optional<DrugBrand> updateDrugBrand(DrugBrand drugBrand, Integer id) {
        return drugBrandRepo.findById(id).map(e ->{
            e.setDrugb_name(drugBrand.getDrugb_name());
            return e;
        });
    }

    @Override
    public void deleteDrugBrand(Integer id) {
        drugBrandRepo.deleteById(id);
    }

    @Override
    public List<DrugBrandCatDTO> getAllDrugCategoryNames() {
        List<DrugBrandCatDTO> dBrandList = new ArrayList<DrugBrandCatDTO>();
        drugBrandRepo.getAllDrugBrandBydCategory().forEach(dBrandList::add);
        return dBrandList;
    }

    @Override
    public DrugBrand getDrugBrandById(Integer id) {
        Optional<DrugBrand> drugb = Optional.ofNullable(
                drugBrandRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id"))
        );
        DrugBrand drugBrand = drugb.get();
        return drugBrand;
    }
}
