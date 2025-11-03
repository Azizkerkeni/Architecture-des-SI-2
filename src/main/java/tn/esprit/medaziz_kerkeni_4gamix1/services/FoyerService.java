package tn.esprit.medaziz_kerkeni_4gamix1.services;


import tn.esprit.medaziz_kerkeni_4gamix1.entity.Foyer;

import java.util.List;

public interface FoyerService {


    Foyer ajouterfoyer(Foyer foyer);
    Foyer modifierfoyer(Foyer foyer);
    void supprimerfoyer(Long id);
    Foyer getfoyer(Long id);
    List<Foyer> getFoyer();
}
