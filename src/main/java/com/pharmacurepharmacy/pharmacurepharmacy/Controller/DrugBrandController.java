package com.pharmacurepharmacy.pharmacurepharmacy.Controller;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugBrand;
import com.pharmacurepharmacy.pharmacurepharmacy.Model.PDrugs;

import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.DrugBrandCatDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.pDrugsDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.DrugBrandService;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.PDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrugBrandController {

    @Autowired
    DrugBrandService drugBrandService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveBrand")
    public void saveDrugBrand(@RequestBody DrugBrand drugBrand){
        drugBrandService.saveDrugBrand(drugBrand);
    }

    @RequestMapping("/getAllBrands")
    public List<DrugBrand> getAllBrands(){
        return drugBrandService.getAllDrugBrands();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateBrand/{id}")
    public void updateBrand(@RequestBody DrugBrand brand, @PathVariable Integer id){
        drugBrandService.updateDrugBrand(brand, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteBrand/{id}")
    public void deleteBrand(@PathVariable Integer id){
        drugBrandService.deleteDrugBrand(id);
    }

    @GetMapping("/getAllByName")
    public List<DrugBrandCatDTO> getAllCategoryNames(){
        return drugBrandService.getAllDrugCategoryNames();
    }
}
