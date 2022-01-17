package com.pharmacurepharmacy.pharmacurepharmacy.Repository;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DCategory;
import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugBrand;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugBrandCatDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DrugBrandRepo extends CrudRepository<DrugBrand, Integer> {

    @Query(value = "SELECT new com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugBrandCatDTO(b.drugb_id, b.drugb_name, c.drugcat_id, c.drugcat_name) FROM DrugBrand b JOIN DCategory c ON b.dCategory = c", nativeQuery = false)
    List<DrugBrandCatDTO> getAllDrugBrandBydCategory();
}
