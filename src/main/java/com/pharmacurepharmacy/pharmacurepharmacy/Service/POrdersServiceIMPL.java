package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.POrders;
import com.pharmacurepharmacy.pharmacurepharmacy.Repository.POrdersServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class POrdersServiceIMPL implements POrdersService {

    private POrdersServiceRepo pOrdersServiceRepo;

    @Autowired
    public POrdersServiceIMPL(POrdersServiceRepo pOrdersServiceRepo){
        this.pOrdersServiceRepo = pOrdersServiceRepo;
    }


    @Override
    public List<POrders> findAllOrders() {
        return null;
    }

    @Override
    public POrders getOrderById(int theId) {
        return null;
    }

    @Override
    public void deleteOrder(int theId) {

    }

    @Override
    public void saveOrder(POrders pOrders) {

    }
}
