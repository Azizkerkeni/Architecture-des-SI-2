package tn.esprit.medaziz_kerkeni_4gamix1.services;



import tn.esprit.medaziz_kerkeni_4gamix1.entity.Etudiant;

import java.util.List;

public interface EtudiantService {

    Etudiant ajouteretudiant(Etudiant etudiant);
    Etudiant modifieretudiant(Etudiant etudiant);
    void supprimeretudiant(Long id);
    Etudiant getetudiant(int id);
    List<Etudiant> getEtudiant();
}
