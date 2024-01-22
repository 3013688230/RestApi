package com.api.rest_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Aplication")
public class Aplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    private Long id;

    @Column(name = "app_code", unique = true)
    private String code;

    @Column(name = "app_name")
    private String name;

    @Column(name = "app_description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
