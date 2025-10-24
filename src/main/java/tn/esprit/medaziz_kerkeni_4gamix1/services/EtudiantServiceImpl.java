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
        return EtudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant modifieretudiant(Etudiant etudiant) {
        return EtudiantRepository.save(etudiant);
    }

    @Override
    public void supprimeretudiant(Long id) {

        EtudiantRepository.deleteById(Math.toIntExact(id));

    }

    @Override
    public Etudiant getetudiant(int id) {
        return EtudiantRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Etudiant> getEtudiant() {
        return (List<Etudiant>) EtudiantRepository.findAll();
    }
}
