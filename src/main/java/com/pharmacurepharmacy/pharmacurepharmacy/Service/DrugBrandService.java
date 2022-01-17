package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugBrand;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugBrandCatDTO;

import java.util.List;
import java.util.Optional;

public interface DrugBrandService {

    void saveDrugBrand(DrugBrand drugBrand);

    List<DrugBrand> getAllDrugBrands();

    Optional updateDrugBrand(DrugBrand drugBrand, Integer id);

    void deleteDrugBrand(Integer id);

    List<DrugBrandCatDTO> getAllDrugCategoryNames();

    DrugBrand getDrugBrandById(Integer id);
}
