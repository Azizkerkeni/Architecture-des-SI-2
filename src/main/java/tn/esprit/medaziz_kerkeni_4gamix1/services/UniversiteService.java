package tn.esprit.medaziz_kerkeni_4gamix1.services;


import tn.esprit.medaziz_kerkeni_4gamix1.entity.Universite;

import java.util.List;

public interface UniversiteService {


    Universite ajouteruniversite(Universite universite);
    Universite modifieruniversite(Universite universite);
    void supprimeruniversite(Long id);
    Universite getuniversite(int id);
    List<Universite> getUniversite();
}
