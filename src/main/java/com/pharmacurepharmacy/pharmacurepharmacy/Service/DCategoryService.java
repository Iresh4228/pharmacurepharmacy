package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DCategory;

import java.util.List;
import java.util.Optional;

public interface DCategoryService {
    void addDrugCategory(DCategory dCategory);

    List<DCategory> getAllDrugCategories();

    Optional<DCategory> updateDrugCategory(Integer id, DCategory dCategory);

    void deleteDrugCategory(Integer id);

    DCategory getDrugsCategoryById(Integer id);
}
