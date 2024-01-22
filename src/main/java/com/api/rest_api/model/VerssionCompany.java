package com.api.rest_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Verssion_Company")
public class VerssionCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "version_company_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Coompany coompany;

    @ManyToOne
    @JoinColumn(name = "version_id", unique = true)
    private Verssion version;

    @Column(name = "version_company_description")
    private String versionCompanyDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Coompany getCompany() {
        return coompany;
    }

    public void setCompany(Coompany company) {
        this.coompany = company;
    }

    public Verssion getVersion() {
        return version;
    }

    public void setVersion(Verssion version) {
        this.version = version;
    }

    public String getVersionCompanyDescription() {
        return versionCompanyDescription;
    }

    public void setVersionCompanyDescription(String versionCompanyDescription) {
        this.versionCompanyDescription = versionCompanyDescription;
    }
}
