package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DCategory;
import com.pharmacurepharmacy.pharmacurepharmacy.Repository.DCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DCategoryServiceIMPL implements DCategoryService{

    @Autowired
    private DCategoryRepo dCategoryRepo;


    @Override
    public void addDrugCategory(DCategory dCategory) {
        dCategoryRepo.save(dCategory);
    }

    @Override
    public List<DCategory> getAllDrugCategories() {
        List<DCategory> dcatList = new ArrayList<>();
        dCategoryRepo.findAll().forEach(dcatList::add);
        return dcatList;
    }

    @Override
    public Optional<DCategory> updateDrugCategory(Integer id, DCategory dCategory) {
        return dCategoryRepo.findById(id).map(e->{
            e.setDrugcat_name(dCategory.getDrugcat_name());
            return e;
        });
    }

    @Override
    public void deleteDrugCategory(Integer id) {
        dCategoryRepo.deleteById(id);
    }

    @Override
    public DCategory getDrugsCategoryById(Integer id) {
        Optional<DCategory> cat = Optional.ofNullable(dCategoryRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id")));
        DCategory dCategory = cat.get();
        return dCategory;
    }
}
