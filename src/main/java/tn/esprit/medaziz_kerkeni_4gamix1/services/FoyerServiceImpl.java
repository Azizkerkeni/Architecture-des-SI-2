package tn.esprit.medaziz_kerkeni_4gamix1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.Repositories.FoyerRepository;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Foyer;

import java.util.List;
@AllArgsConstructor
@Service
public class FoyerServiceImpl implements FoyerService {


    private FoyerRepository FoyerRepository;


    @Override
    public Foyer ajouterfoyer(Foyer foyer) {
        return FoyerRepository.save(foyer);
    }

    @Override
    public Foyer modifierfoyer(Foyer foyer) {
        return FoyerRepository.save(foyer);
    }

    @Override
    public void supprimerfoyer(Long id) {

        FoyerRepository.deleteById(Math.toIntExact(id));

    }

    @Override
    public Foyer getfoyer(int id) {
        return FoyerRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Foyer> getFoyer() {
        return (List<Foyer>) FoyerRepository.findAll();
    }
}
