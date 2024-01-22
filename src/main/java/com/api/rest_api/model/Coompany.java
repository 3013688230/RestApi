package com.api.rest_api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Coompany")
public class Coompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")
    private Long id;

    @Column(name = "codigo_company", unique = true)
    private String codigo;

    @Column(name = "name_company")
    private String name;

    @Column(name = "description_company")
    private String description;

    @OneToMany(mappedBy = "coompany", cascade = CascadeType.ALL)
    private List<VerssionCompany> versions;

    public List<VerssionCompany> getVersions() {
        return versions;
    }

    public void setVersions(List<VerssionCompany> versions) {
        this.versions = versions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
