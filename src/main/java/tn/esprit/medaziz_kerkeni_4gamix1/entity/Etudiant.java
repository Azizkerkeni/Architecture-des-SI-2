package tn.esprit.medaziz_kerkeni_4gamix1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Etudiant {

    // Getters et Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;

}
