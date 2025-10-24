package tn.esprit.medaziz_kerkeni_4gamix1.services;


import tn.esprit.medaziz_kerkeni_4gamix1.entity.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation ajouterreservation(Reservation reservation);
    Reservation modifierreservation(Reservation reservation);
    void supprimerreservation(Long id);
    Reservation getreservation(int id);
    List<Reservation> getReservation();
}
