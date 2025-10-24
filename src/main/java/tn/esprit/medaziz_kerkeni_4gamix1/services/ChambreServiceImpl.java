package tn.esprit.medaziz_kerkeni_4gamix1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.Repositories.ChambreRepository;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Chambre;

import java.util.List;
@AllArgsConstructor
@Service

public class ChambreServiceImpl implements ChambreService {

    private ChambreRepository  ChambreRepository;

    @Override
    public Chambre ajouterchambre(Chambre chambre) {
        return ChambreRepository.save(chambre);
    }

    @Override
    public Chambre modifierchambre(Chambre chambre) {
        return ChambreRepository.save(chambre);
    }

    @Override
    public void supprimerchambre(Long id) {

        ChambreRepository.deleteById(id);

    }

    @Override
    public Chambre getchambre(int id) {
        return ChambreRepository.findById((long) id).orElseThrow();
    }

    @Override
    public List<Chambre> getChambre() {
        return ChambreRepository.findAll();
    }
}
