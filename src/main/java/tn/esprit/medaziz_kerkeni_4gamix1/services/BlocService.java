package tn.esprit.medaziz_kerkeni_4gamix1.services;

import tn.esprit.medaziz_kerkeni_4gamix1.entity.Bloc;

import java.util.List;

public interface BlocService {

    Bloc ajouterBloc(Bloc bloc);
    Bloc modifierBloc(Bloc bloc);
    void supprimerBloc(Long id);
    Bloc getBloc(int id);
    List<Bloc> getBlocs();
}
