package tn.esprit.medaziz_kerkeni_4gamix1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Reservation;

import java.util.List;
@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public Reservation ajouterreservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation modifierreservation(Reservation reservation) {
        return null;
    }

    @Override
    public void supprimerreservation(Long id) {

    }

    @Override
    public Reservation getreservation(int id) {
        return null;
    }

    @Override
    public List<Reservation> getReservation() {
        return List.of();
    }
}
