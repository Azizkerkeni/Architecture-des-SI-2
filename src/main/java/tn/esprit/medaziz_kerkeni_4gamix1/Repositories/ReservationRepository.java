package tn.esprit.medaziz_kerkeni_4gamix1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
