package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Reservation {

    @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private boolean estValide;

    @ManyToOne
    @JoinColumn(name = "id_chambre")
    private Chambre chambre;

    @ManyToMany
    @JoinTable(
            name = "etudiant_reservation",
            joinColumns = @JoinColumn(name = "id_reservation"),
            inverseJoinColumns = @JoinColumn(name = "id_etudiant")
    )
    private List<Etudiant> etudiants;

    // Getters et Setters
    public String getIdReservation() { return idReservation; }
    public void setIdReservation(String idReservation) { this.idReservation = idReservation; }
    public Date getAnneeUniversitaire() { return anneeUniversitaire; }
    public void setAnneeUniversitaire(Date anneeUniversitaire) { this.anneeUniversitaire = anneeUniversitaire; }
    public boolean isEstValide() { return estValide; }
    public void setEstValide(boolean estValide) { this.estValide = estValide; }
    public Chambre getChambre() { return chambre; }
    public void setChambre(Chambre chambre) { this.chambre = chambre; }
    public List<Etudiant> getEtudiants() { return etudiants; }
    public void setEtudiants(List<Etudiant> etudiants) { this.etudiants = etudiants; }
}
