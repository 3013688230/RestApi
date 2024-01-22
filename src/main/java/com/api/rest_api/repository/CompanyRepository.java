package com.api.rest_api.repository;

import com.api.rest_api.model.Coompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Coompany, Long> {
    Coompany findByCodigo(String codigo);
    List<Coompany> findByName(String name);
}
