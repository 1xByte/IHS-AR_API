package com.ar.api.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class CitizenDetailsDTO {

    private String citizenName;

    private String citizenEmail;

    private String phoneNumber;

    private LocalDate DOB;

    private String SSN;

    private String stateName;

    private String cityName;

    private Integer houseNo;

}
