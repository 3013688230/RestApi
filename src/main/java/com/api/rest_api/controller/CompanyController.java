package com.api.rest_api.controller;

import com.api.rest_api.model.Coompany;
import com.api.rest_api.model.VerssionCompany;
import com.api.rest_api.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping("/byCode/{codigo}")
    public CompanyDTO getCompanyByCode(@PathVariable String codigo) {
        Coompany company = companyRepository.findByCodigo(codigo);

        if (company != null && !company.getVersions().isEmpty()) {
            VerssionCompany versionCompany = company.getVersions().get(0);
            return new CompanyDTO(
                    company.getCodigo(),
                    company.getName(),
                    versionCompany.getVersion().getApplication().getName(),
                    versionCompany.getVersion().getVersion()
            );
        } else {
            return null;
        }
    }

    private static class CompanyDTO {
        private final String codigo_company;
        private final String name_company;
        private final String app_name;
        private final String version;

        public CompanyDTO(String codigo_company, String name_company, String app_name, String version) {
            this.codigo_company = codigo_company;
            this.name_company = name_company;
            this.app_name = app_name;
            this.version = version;
        }

        public String getCodigo_company() {
            return codigo_company;
        }

        public String getName_company() {
            return name_company;
        }

        public String getApp_name() {
            return app_name;
        }

        public String getVersion() {
            return version;
        }
    }
}
