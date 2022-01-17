package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugStock;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugStockDTO;

import java.util.List;
import java.util.Optional;

public interface DrugStockService {
    void addDrugStock(DrugStock drugStock);

    List<DrugStock> getAllStocks();

    Optional<DrugStock> updateDrugStock(Integer id, DrugStock drugStock);

    void deleteDrugStock(Integer id);

//    List<DrugStockDTO> getAllDetailsOfDrugStock();

    Optional<DrugStock> reduceDrugStockQuantity(Integer id, int qty);

    DrugStock getDrugStkById(Integer id);
}
