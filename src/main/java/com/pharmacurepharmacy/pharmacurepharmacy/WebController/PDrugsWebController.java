package com.pharmacurepharmacy.pharmacurepharmacy.WebController;


import com.pharmacurepharmacy.pharmacurepharmacy.Model.PDrugs;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.PDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/drugs")
public class PDrugsWebController {

//    private PDrugsService pDrugsService;
//
//    @Autowired
//    public PDrugsWebController(PDrugsService pDrugsService){
//        this.pDrugsService = pDrugsService;
//    }
//
//    //add mapping for "/druglist"
//    @RequestMapping("/druglist")
//    public String getDrugs(Model model) {
//
//
//        List<PDrugs> pDrugs = pDrugsService.getAllDrugs();
//
//        model.addAttribute("drugs",pDrugs);
//
//        //return view
//        return "drugs/drugs-list";
//
//    }
//    @GetMapping("/showFormForAdd")
//    public String saveDrugs(Model theModel) {
//        PDrugs pDrugs = new PDrugs();
//        theModel.addAttribute("pdrug",pDrugs);
//
//        return "drugs/drugs-form";
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
}
