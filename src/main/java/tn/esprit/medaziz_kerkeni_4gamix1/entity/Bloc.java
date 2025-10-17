package tn.esprit.medaziz_kerkeni_4gamix1.entity;



import jakarta.persistence.*;
import java.util.List;

@Entity
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    @JoinColumn(name = "id_foyer")
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private List<Chambre> chambres;

    // Getters et Setters
    public Long getIdBloc() { return idBloc; }
    public void setIdBloc(Long idBloc) { this.idBloc = idBloc; }
    public String getNomBloc() { return nomBloc; }
    public void setNomBloc(String nomBloc) { this.nomBloc = nomBloc; }
    public Long getCapaciteBloc() { return capaciteBloc; }
    public void setCapaciteBloc(Long capaciteBloc) { this.capaciteBloc = capaciteBloc; }
    public Foyer getFoyer() { return foyer; }
    public void setFoyer(Foyer foyer) { this.foyer = foyer; }
    public List<Chambre> getChambres() { return chambres; }
    public void setChambres(List<Chambre> chambres) { this.chambres = chambres; }
}
