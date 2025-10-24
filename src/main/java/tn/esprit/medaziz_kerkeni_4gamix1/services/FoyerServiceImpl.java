package tn.esprit.medaziz_kerkeni_4gamix1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Foyer;

import java.util.List;
@AllArgsConstructor
@Service
public class FoyerServiceImpl implements FoyerService {
    @Override
    public Foyer ajouterfoyer(Foyer foyer) {
        return null;
    }

    @Override
    public Foyer modifierfoyer(Foyer foyer) {
        return null;
    }

    @Override
    public void supprimerfoyer(Long id) {

    }

    @Override
    public Foyer getfoyer(int id) {
        return null;
    }

    @Override
    public List<Foyer> getFoyer() {
        return List.of();
    }
}
