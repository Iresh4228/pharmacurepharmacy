package com.pharmacurepharmacy.pharmacurepharmacy.WebController;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.Pharmacist;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.PharmacistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pharmacist")
public class PharmacistWebController {

    private PharmacistService pharmacistService;

    public PharmacistWebController(PharmacistService pharmacistService){
        this.pharmacistService = pharmacistService;
    }

    @RequestMapping("/list")
    public String getPharmacist(Model model) {

        List<Pharmacist> pharmacists = pharmacistService.findAllPharmacists();
        model.addAttribute("pharmacists",pharmacists);
        return "pharmacists/pharmacist-list";

    }

    @GetMapping("/showFormForAdd")
    public String savePharmacist(Model theModel) {
        Pharmacist pharmacist = new Pharmacist();
        theModel.addAttribute("pharmacist",pharmacist);
        return "pharmacists/pharmacist-form";
    }

    @GetMapping("/showFormForUpdate")
    public String updatePharmacist(@RequestParam("pharmacistid") int pId  , Model theModel) {
        Pharmacist pharmacist = pharmacistService.getPharmacistById(pId);
        theModel.addAttribute("pharmacist" , pharmacist);
        return "pharmacists/pharmacist-form";

    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("pharmacistid") int pId) {
        pharmacistService.deletePharmacist(pId);
        return "redirect:/pharmacists/list";
    }


    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("pharmacist") Pharmacist pharmacist) {
        pharmacistService.savePharmacist(pharmacist);
        return "redirect:/pharmacists/list";

    }





}
