package tn.esprit.medaziz_kerkeni_4gamix1.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Reservation;
import tn.esprit.medaziz_kerkeni_4gamix1.services.ReservationService;

import java.util.List;


@RestController
@RequestMapping("/api/Reservation")
@AllArgsConstructor
public class ReservationController {

    private final ReservationService ReservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation Reservation) {
        return ReservationService.ajouterreservation(Reservation);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation Reservation) {
        return ReservationService.modifierreservation(Reservation);
    }


    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        ReservationService.supprimerreservation(id);
    }

    @GetMapping("/getReservation/{id}")
    public Reservation getReservation(@PathVariable Long id) {
        return ReservationService.getreservation(id);
    }

    @GetMapping("/getReservation")
    public List<Reservation> getFoyer() {
        return ReservationService.getReservation();
    }
}
