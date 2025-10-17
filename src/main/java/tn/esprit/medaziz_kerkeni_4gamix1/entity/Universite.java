package tn.esprit.medaziz_kerkeni_4gamix1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Universite {

    // Getters et Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToMany(mappedBy = "universite", cascade = CascadeType.ALL)
    private List<Foyer> foyers;

}
