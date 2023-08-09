package com.ar.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer caseNo;

    private String citizenName;

    private String citizenEmail;

    private String phoneNumber;

    private LocalDate DOB;

    private String SSN;

    private String stateName;

    private String cityName;

    private Integer houseNo;

    private Integer createdBy;

    @CreationTimestamp
    @Column(insertable = false)
    private LocalDate createdDate;
}
