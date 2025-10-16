package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToMany(mappedBy = "universite", cascade = CascadeType.ALL)
    private List<Foyer> foyers;

    // Getters et Setters
    public Long getIdUniversite() { return idUniversite; }
    public void setIdUniversite(Long idUniversite) { this.idUniversite = idUniversite; }
    public String getNomUniversite() { return nomUniversite; }
    public void setNomUniversite(String nomUniversite) { this.nomUniversite = nomUniversite; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public List<Foyer> getFoyers() { return foyers; }
    public void setFoyers(List<Foyer> foyers) { this.foyers = foyers; }
}
