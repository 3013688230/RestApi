package com.api.rest_api.repository;

import com.api.rest_api.model.VerssionCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VerssionCompanyRepository extends JpaRepository<VerssionCompany, Long> {
    List<VerssionCompany> findByCompanyId(Long companyId);
}
