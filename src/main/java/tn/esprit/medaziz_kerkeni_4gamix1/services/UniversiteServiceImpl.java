package tn.esprit.medaziz_kerkeni_4gamix1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Universite;

import java.util.List;
@AllArgsConstructor
@Service
public class UniversiteServiceImpl implements UniversiteService {
    @Override
    public Universite ajouteruniversite(Universite universite) {
        return null;
    }

    @Override
    public Universite modifieruniversite(Universite universite) {
        return null;
    }

    @Override
    public void supprimeruniversite(Long id) {

    }

    @Override
    public Universite getuniversite(int id) {
        return null;
    }

    @Override
    public List<Universite> getUniversite() {
        return List.of();
    }
}
