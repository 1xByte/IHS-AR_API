package com.ar.api.service;

import com.ar.api.DTO.CitizenDTO;
import com.ar.api.DTO.CitizenDetailsDTO;

public interface CaseService {

    Boolean checkSSN(CitizenDTO citizenDTO);
    String addCitizen(CitizenDetailsDTO citizenDetailsDTO);



}
