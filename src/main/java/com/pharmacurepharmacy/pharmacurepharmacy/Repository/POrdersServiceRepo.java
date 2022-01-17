package com.pharmacurepharmacy.pharmacurepharmacy.Repository;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.POrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface POrdersServiceRepo extends JpaRepository<POrders, Integer> {
}
