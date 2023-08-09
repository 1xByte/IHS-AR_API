package com.ar.api.service;

import com.ar.api.DTO.CitizenDTO;
import com.ar.api.DTO.CitizenDetailsDTO;
import com.ar.api.model.CaseEntity;
import com.ar.api.repo.CaseRepo;
import com.ar.api.utils.StringConstants;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class CaseServiceImpl implements CaseService{

    @Autowired
    private CaseRepo caseRepo;
    @Override
    public Boolean checkSSN(CitizenDTO citizenDTO) {
        return null;
    }

    @Override
    public String addCitizen(CitizenDetailsDTO citizenDetailsDTO) {

        CaseEntity aCase= new CaseEntity();

        BeanUtils.copyProperties(citizenDetailsDTO,aCase);

        caseRepo.save(aCase);

        return StringConstants.CITIZEN_ADDED;
    }
}
