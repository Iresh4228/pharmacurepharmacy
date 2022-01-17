package com.pharmacurepharmacy.pharmacurepharmacy.Controller;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.PDrugs;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.pDrugsDTO;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.PDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PDrugsController {

    @Autowired
    private PDrugsService pDrugsService;

    @RequestMapping(method = RequestMethod.POST, value = "/saveDrug")
    public void saveDrug(@RequestBody PDrugs pDrugs){
        pDrugsService.saveDrug(pDrugs);
    }

    @RequestMapping("/getAllDrugs")
    public List<PDrugs> getAllDrugs(){
        return pDrugsService.getAllDrugs();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateDrug/{id}")
    public void updateDrugs(@PathVariable Integer id, @RequestBody PDrugs pDrugs){
        pDrugsService.updateDrug(id, pDrugs);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteDrug/{id}")
    public void deleteDrug(@PathVariable Integer id){
        pDrugsService.deleteDrug(id);
    }

    @GetMapping("/getAllDrugsByNames")
    public List<pDrugsDTO> getAllByNames(){
        return pDrugsService.getAllByNames();
    }

    @GetMapping("/getDrugById/{id}")
    public  PDrugs getDrugById(@PathVariable Integer id){
        return pDrugsService.getByID(id);
    }
}
