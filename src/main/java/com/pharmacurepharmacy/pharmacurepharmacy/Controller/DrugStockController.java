package com.pharmacurepharmacy.pharmacurepharmacy.Controller;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugStock;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugStockDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.DrugStockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrugStockController {

    private DrugStockService drugStockService;

    @RequestMapping(method = RequestMethod.POST, value = "/addStock")
    public void addStock(@RequestBody DrugStock drugStock){
        drugStockService.addDrugStock(drugStock);
    }

    @RequestMapping("/getAllStocks")
    public List<DrugStock> getAllStock(){
        return drugStockService.getAllStocks();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateStock/{id}")
    public void updateStock(@PathVariable Integer id, @RequestBody DrugStock drugStock){
        drugStockService.updateDrugStock(id, drugStock);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteStock/{id}")
    public void deleteStock(@PathVariable Integer id){
        drugStockService.deleteDrugStock(id);
    }

//    @GetMapping("/getAllStockDetails")
//    public List<DrugStockDTO> getAllStockDetails(){
//        return drugStockService.getAllDetailsOfDrugStock();
//    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateStockQty/{id}/{qty}")
    public int reduceStockQty(@PathVariable Integer id, @PathVariable int qty){
        System.out.println("\n Id : "+id+" Qty: "+qty);
        drugStockService.reduceDrugStockQuantity(id, qty);
        return 1;
    }
}
