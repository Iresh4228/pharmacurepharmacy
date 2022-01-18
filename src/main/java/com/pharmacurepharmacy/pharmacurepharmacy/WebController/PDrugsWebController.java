package com.pharmacurepharmacy.pharmacurepharmacy.WebController;


import com.pharmacurepharmacy.pharmacurepharmacy.Model.DCategory;
import com.pharmacurepharmacy.pharmacurepharmacy.Model.DrugBrand;
import com.pharmacurepharmacy.pharmacurepharmacy.Model.PDrugs;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.pDrugsDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.DCategoryService;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.DrugBrandService;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.PDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping()
public class PDrugsWebController {


    @Autowired
  private PDrugsService pDrugsService;
    @Autowired
    private DCategoryService dCategoryService;
    @Autowired
    private DrugBrandService drugBrandService;
//
//    @Autowired
//    public PDrugsWebController(PDrugsService pDrugsService){
//        this.pDrugsService = pDrugsService;
//    }
//
    //add mapping for "/druglist"
    @RequestMapping("/druglist")
    public String getDrugs(Model model) {


        List<pDrugsDTO> pDrugs = pDrugsService.getAllByNames();

        model.addAttribute("drugs",pDrugs);

        //return view
        return "list-book";

    }
//    @GetMapping("/showFormForAddDrugs")
//    public String saveDrugs(Model theModel, PDrugs pDrugs) {
//
//        theModel.addAttribute("pDrugs",pDrugs);
//
//        return "add-book";
//    }
//
//
//    @GetMapping("/showFormForUpdate")
//    public String updatePharmacist(@RequestParam("drugid") int did  , Model theModel) {
//
//
//        //get Medicine from service
//        PDrugs pDrugs = pDrugsService.getByID(did);
//
//        // set med as a model attribute
//        theModel.addAttribute("drug" , pDrugs);
//
//
//        //redirect to update form
//        //same form for testing
//        return "drugs/drugs-form";
//
//    }
//
//    @GetMapping("/delete")
//    public String deleteEmployee(@RequestParam("drugid") int did) {
//        pDrugsService.deleteDrug(did);
//        return "redirect:/drugs/list";
//    }
//
//
//    @PostMapping("/add")
//    public String addEmployee(@ModelAttribute("drugs") PDrugs pDrugs) {
//
//        pDrugsService.saveDrug(pDrugs);
//
//        return "redirect:/drugs/list";
//
//    }

    @GetMapping("/showFormForAddDrugs")
    public String addnewdrug(PDrugs pDrugs, Model model) {
        model.addAttribute("category",dCategoryService .getAllDrugCategories());
        model.addAttribute("brands",drugBrandService.getAllDrugBrands());
        return"add-book";
    }
    @PostMapping("/addnewpdrug")
    public String addnewpdrug(@Valid PDrugs pDrugs, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-book";
        }
        pDrugsService.saveDrug(pDrugs);
        return "redirect:/viewbrand";
    }
}
