package com.api.rest_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Verssion")
public class Verssion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "version_id")
    private Long id;

    @Column(name = "version")
    private String version;

    @Column(name = "version_description")
    private String versionDescription;

    @ManyToOne
    @JoinColumn(name = "app_id", unique = true)
    private Aplication aplication;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public Aplication getAplication() {
        return aplication;
    }

    public void setAplication(Aplication aplication) {
        this.aplication = aplication;
    }
}
