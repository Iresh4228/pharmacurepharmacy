package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.POrders;

import java.util.List;

public interface POrdersService {

    List<POrders> findAllOrders();

    POrders getOrderById(int theId);

    void deleteOrder(int theId);

    void saveOrder(POrders pOrders);
}
