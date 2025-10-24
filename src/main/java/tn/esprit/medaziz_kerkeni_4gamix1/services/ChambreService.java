package tn.esprit.medaziz_kerkeni_4gamix1.services;

import tn.esprit.medaziz_kerkeni_4gamix1.entity.Chambre;

import java.util.List;

public interface ChambreService {

    Chambre ajouterchambre(Chambre chambre);
    Chambre modifierchambre(Chambre chambre);
    void supprimerchambre(Long id);
    Chambre getchambre(int id);
    List<Chambre> getChambre();
}
