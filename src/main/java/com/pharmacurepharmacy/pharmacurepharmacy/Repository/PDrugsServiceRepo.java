package com.pharmacurepharmacy.pharmacurepharmacy.Repository;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.PDrugs;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.pDrugsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PDrugsServiceRepo extends CrudRepository<PDrugs, Integer> {
    @Query(value = "SELECT new com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.pDrugsDTO(d.drug_id, d.drug_name, b.drugb_id, b.drugb_name, c.drugcat_id, c.drugcat_name, d.drugqty, d.drugprice) FROM PDrugs d " +
            "JOIN DrugBrand b ON d.drugBrand = b " +
            "JOIN DCategory c ON d.dCategory = c", nativeQuery = false)
    List<pDrugsDTO> getAllDrugDetailsById();
}
