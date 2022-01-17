package com.pharmacurepharmacy.pharmacurepharmacy.Service;

import com.pharmacurepharmacy.pharmacurepharmacy.Model.PDrugs;
import com.pharmacurepharmacy.pharmacurepharmacy.PharmaDTO.pDrugsDTO;

import java.util.List;
import java.util.Optional;

public interface PDrugsService {


    void saveDrug(PDrugs pDrugs);

    List<PDrugs> getAllDrugs();

    Optional<PDrugs> updateDrug(Integer id, PDrugs pDrugs);

    void deleteDrug(Integer id);

    List<pDrugsDTO> getAllByNames();

    PDrugs getByID(Integer id);
}
