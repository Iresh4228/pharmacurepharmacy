package com.pharmacurepharmacy.pharmacurepharmacy.WebController;


import com.pharmacurepharmacy.pharmacurepharmacy.Model.POrders;
import com.pharmacurepharmacy.pharmacurepharmacy.Service.POrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping()
public class POrdersWebController {

    private POrdersService pOrdersService;

    public POrdersWebController(POrdersService pOrdersService){
        this.pOrdersService = pOrdersService;
    }

    @RequestMapping("/list")
    public String getOrders(Model model) {

        List<POrders> pOrders = pOrdersService.findAllOrders();

        model.addAttribute("orders",pOrders);

        return "orders/order-list";

    }

    @GetMapping("/")
    public String showIndex() {

        return "index";

    }

    @GetMapping("/showFormForAdd")
    public String saveOrders(Model theModel) {
        POrders pOrders = new POrders();
        theModel.addAttribute("order",pOrders);

        return "orders/orders-form";
    }

    @GetMapping("/showFormForUpdate")
    public String updatePharmacist(@RequestParam("pharmacistid") int theId  , Model theModel) {

        POrders pOrders = pOrdersService.getOrderById(theId);
        theModel.addAttribute("order" , pOrders);
        return "orders/orders-form";

    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("pharmacistid") int theId) {
        pOrdersService.deleteOrder(theId);
        return "redirect:/orders/list";
    }



    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("order") POrders pOrders) {

        pOrdersService.saveOrder(pOrders);

        return "redirect:/pharmacists/list";

    }
}
