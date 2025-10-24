package tn.esprit.medaziz_kerkeni_4gamix1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.Repositories.EtudiantRepository;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Etudiant;

import java.util.List;
@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements EtudiantService{

    private  EtudiantRepository EtudiantRepository;


    @Override
    public Etudiant ajouteretudiant(Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant modifieretudiant(Etudiant etudiant) {
        return null;
    }

    @Override
    public void supprimeretudiant(Long id) {

    }

    @Override
    public Etudiant getetudiant(int id) {
        return null;
    }

    @Override
    public List<Etudiant> getEtudiant() {
        return List.of();
    }
}
