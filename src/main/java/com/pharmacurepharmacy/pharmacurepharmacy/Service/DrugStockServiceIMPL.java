package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugStock;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugStockDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.Repository.DrugStockRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DrugStockServiceIMPL  implements DrugStockService{

    @Autowired
    private DrugStockRepo drugStockRepo;


    @Override
    public void addDrugStock(DrugStock drugStock) {
        drugStockRepo.save(drugStock);
    }

    @Override
    public List<DrugStock> getAllStocks() {
        List<DrugStock> stklist = new ArrayList<>();
        drugStockRepo.findAll().forEach(stklist::add);
        return stklist;
    }

    @Override
    public Optional<DrugStock> updateDrugStock(Integer id, DrugStock drugStock) {
        return drugStockRepo.findById(id).map(e->{
            e.setpDrugs(drugStock.getpDrugs());
            e.setManufactdate(drugStock.getManufactdate());
            e.setExpirydate(drugStock.getExpirydate());
            e.setRecdate(drugStock.getRecdate());
            return e;
        });
    }

    @Override
    public void deleteDrugStock(Integer id) {
        drugStockRepo.deleteById(id);
    }

//    @Override
//    public List<DrugStockDTO> getAllDetailsOfDrugStock() {
//        List<DrugStockDTO> stklist = new ArrayList<>();
//        drugStockRepo.getAllStockDrugDetails().forEach(stklist::add);
//        return stklist;
//    }

    @Override
    public Optional<DrugStock> reduceDrugStockQuantity(Integer id, int qty) {
        return drugStockRepo.findById(id).map(e->{
            e.setDquantity(qty);
            return e;
        });
    }

    @Override
    public DrugStock getDrugStkById(Integer id) {
        Optional<DrugStock> stocks = Optional.ofNullable(
                drugStockRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID"))
        );
        DrugStock drugStock = stocks.get();
        return drugStock;
    }
}
