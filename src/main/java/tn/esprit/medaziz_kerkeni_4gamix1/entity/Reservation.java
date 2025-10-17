package tn.esprit.medaziz_kerkeni_4gamix1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Reservation {

    // Getters et Setters
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

}
