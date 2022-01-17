package com.pharmacurepharmacy.pharmacurepharmacy.WebController;


import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugBrand;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.DCategoryService;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.DrugBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class DrugsBrandWebC {

//    @Autowired
//    private DrugBrandService drugBrandService;
//
//    @Autowired
//    private DCategoryService dCategoryService;
//
//    @GetMapping("/viewDrugsBrands")
//    public String getAllDrugsBrands(Model model){
//        model.addAttribute("brand", drugBrandService.getAllCategoryNames());
//        return "viewDrugsbrands";
//    }
//
//    @GetMapping("/showAddDrugsBrandForm")
//    public String showAddDrugsBrandForm(DrugBrand drugBrand, Model model){
//        model.addAttribute("category", drugBrandService.getAllCategories());
//        return "addDrugsbrand";
//    }
//
//    @PostMapping("/addNewDrugsBrand")
//    public String addNewDrugsBrand(@Valid DrugBrand drugBrand, BindingResult result, Model model){
//        if(result.hasErrors()){
//            return  "addDrugsbrand";
//        }
//        drugBrandService.saveBrand(drugBrand);
//        return "redirect:/viewDrugsBrands";
//    }
//
//    @GetMapping("/showUpdateDrugsBrand/{id}")
//    public String showEditDrugsBrandForm(@PathVariable("id") Integer id, Model model){
//        model.addAttribute("drugs", drugBrandService.getBrandById(id));
//        return "editDrugsbrands";
//    }
//
//    @PostMapping("/updateDrugsBrand/{id}")
//    public String updateDrugsBrand(@PathVariable ("id") Integer id, @Valid DrugBrand drugBrand, BindingResult result, Model model){
//        if(result.hasErrors()){
//            drugBrand.setBrandID(id);
//            model.addAttribute("drugs", drugBrand);
//            return "editDrugsbrands";
//        }
//        Optional<DrugBrand> brand1 = drugBrandService.updateBrand(drugBrand, id);
//        return "redirect:/viewDrugsBrands";
//    }
//
//    @GetMapping("/deleteDrugsBrand/{id}")
//    public String deleteDrugsPharmacist(@PathVariable ("id") Integer id, Model model) {
//        drugBrandService.deleteBrand(id);
//        return "redirect:/viewDrugsBrands";
//    }
}
