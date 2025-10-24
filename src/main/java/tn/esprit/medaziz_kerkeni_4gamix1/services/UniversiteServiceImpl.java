package tn.esprit.medaziz_kerkeni_4gamix1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.Repositories.UniversiteRepository;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Universite;

import java.util.List;

@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements UniversiteService {

    private UniversiteRepository universiteRepository;

    @Override
    public Universite ajouteruniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite modifieruniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void supprimeruniversite(Long id) {
        universiteRepository.deleteById(Math.toIntExact(id));
    }


    @Override
    public Universite getuniversite(Long id) {
        return universiteRepository.findById(Math.toIntExact(id)).orElseThrow();
    }

    @Override
    public List<Universite> getUniversite() {
        return (List<Universite>) universiteRepository.findAll();
    }
}
