package com.api.rest_api.service;

import com.api.rest_api.model.Coompany;
import com.api.rest_api.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Coompany saveCompany(Coompany company) {
        return companyRepository.save(company);
    }

    public Coompany getCompanyById(Long companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    public List<Coompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public void deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);
    }
}
