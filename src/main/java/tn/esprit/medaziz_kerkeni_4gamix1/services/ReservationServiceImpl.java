package tn.esprit.medaziz_kerkeni_4gamix1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.medaziz_kerkeni_4gamix1.Repositories.ReservationRepository;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Reservation;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterreservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation modifierreservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimerreservation(Long id) {
        reservationRepository.deleteById(id);
    }


    @Override
    public Reservation getreservation(Long id) {
        return reservationRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Reservation> getReservation() {
        return reservationRepository.findAll();
    }
}
