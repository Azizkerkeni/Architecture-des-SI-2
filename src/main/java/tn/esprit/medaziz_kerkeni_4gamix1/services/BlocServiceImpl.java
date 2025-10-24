package tn.esprit.medaziz_kerkeni_4gamix1.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.Repositories.BlocRepository;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Bloc;

import java.util.List;

@AllArgsConstructor
@Service

public class BlocServiceImpl implements BlocService {


    private BlocRepository blocRepository;


    @Override
    public Bloc ajouterBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc modifierBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void supprimerBloc(Long id) {
        blocRepository.deleteById(id);

    }

    @Override
    public Bloc getBloc(int id) {
        return blocRepository.findById((long) id).orElseThrow();
    }

    @Override
    public List<Bloc> getBlocs() {
        return blocRepository.findAll();
    }
}
