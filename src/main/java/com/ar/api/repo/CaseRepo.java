package com.ar.api.repo;

import com.ar.api.model.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepo extends JpaRepository<CaseEntity,Integer> {
}
