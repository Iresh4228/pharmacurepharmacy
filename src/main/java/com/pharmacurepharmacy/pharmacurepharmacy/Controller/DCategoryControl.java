package com.pharmacurepharmacy.pharmacurepharmacy.Controller;


import com.pharmacurepharmacy.pharmacurepharmacy.Model.DCategory;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.DCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DCategoryControl {

    @Autowired
    private DCategoryService dCategoryService;

    @RequestMapping(method = RequestMethod.POST, value = "/addDrugCategory")
    public void addDrugCategory(@RequestBody DCategory dCategory){
        dCategoryService.addDrugCategory(dCategory);
    }

    @RequestMapping("/getAllDrugCategories")
    public List<DCategory> getAllDrugCategories(){
        return dCategoryService.getAllDrugCategories();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateDrugCategory/{id}")
    public  void updateDrugCategory(@PathVariable Integer id, @RequestBody DCategory dCategory){
        dCategoryService.updateDrugCategory(id, dCategory);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteDrugCategory/{id}")
    public void deleteDrugCategory(@PathVariable Integer id){
        dCategoryService.deleteDrugCategory(id);
    }
}
