package com.pharmacurepharmacy.pharmacurepharmacy.Repository;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugStock;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugStockDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DrugStockRepo extends CrudRepository <DrugStock, Integer> {

//    List<DrugStockDTO> getAllStockDrugDetails();
}
