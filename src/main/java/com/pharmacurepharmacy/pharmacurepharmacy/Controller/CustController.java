package com.pharmacurepharmacy.pharmacurepharmacy.Controller;


import com.pharmacurepharmacy.pharmacurepharmacy.Model.PCustomer;
import com.pharmacurepharmacy.pharmacurepharmacy.Model.PCustomerLogin;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.PCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustController {

    @Autowired
    PCustomerService pCustomerService;

    @RequestMapping(method = RequestMethod.POST, value = "/addCustomer")
    public void addCustomer(@RequestBody PCustomer pCustomer) {
        pCustomerService.addCustomer(pCustomer);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateCustomer/{id}")
    public void updateCustomer(@RequestBody PCustomer pCustomer, @PathVariable Integer id) {
        pCustomerService.customerUpdate(id,pCustomer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        pCustomerService.deleteCustomer(id);
    }

    @RequestMapping("/getAllCustomers")
    public List<PCustomer> getAllCustomers() {
        return pCustomerService.getAllCustomers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getCustomerById/{id}")
    private PCustomer getCustomerById(@PathVariable Integer id) {
        return pCustomerService.getCustomerByID(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/checkCustomerLogin/{email}")
    private PCustomerLogin getCustomerLoginInfo(@PathVariable String custemail){
        return pCustomerService.checkCustomerLoginInfo(custemail);
    }


}
