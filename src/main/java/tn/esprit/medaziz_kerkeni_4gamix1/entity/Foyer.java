package tn.esprit.medaziz_kerkeni_4gamix1.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @ManyToOne
    @JoinColumn(name = "id_universite")
    private Universite universite;

    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    private List<Bloc> blocs;

    // Getters et Setters
    public Long getIdFoyer() { return idFoyer; }
    public void setIdFoyer(Long idFoyer) { this.idFoyer = idFoyer; }
    public String getNomFoyer() { return nomFoyer; }
    public void setNomFoyer(String nomFoyer) { this.nomFoyer = nomFoyer; }
    public Long getCapaciteFoyer() { return capaciteFoyer; }
    public void setCapaciteFoyer(Long capaciteFoyer) { this.capaciteFoyer = capaciteFoyer; }
    public Universite getUniversite() { return universite; }
    public void setUniversite(Universite universite) { this.universite = universite; }
    public List<Bloc> getBlocs() { return blocs; }
    public void setBlocs(List<Bloc> blocs) { this.blocs = blocs; }
}
