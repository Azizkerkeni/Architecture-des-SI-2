package tn.esprit.medaziz_kerkeni_4gamix1.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Universite;
import tn.esprit.medaziz_kerkeni_4gamix1.services.UniversiteService;

import java.util.List;


@RestController
@RequestMapping("/api/Universite")
@AllArgsConstructor
public class UniversiteController {

    private final UniversiteService UniversiteService;

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite Universite) {
        return UniversiteService.ajouteruniversite(Universite);
    }

    @PutMapping("/updateReservation")
    public Universite updateUniversite(@RequestBody Universite Universite) {
        return UniversiteService.modifieruniversite(Universite);
    }


    @DeleteMapping("/deleteUniversite/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        UniversiteService.supprimeruniversite(id);
    }

    @GetMapping("/getUniversite/{id}")
    public Universite getUniversite(@PathVariable Long id) {
        return UniversiteService.getuniversite(id);
    }

    @GetMapping("/getReservation")
    public List<Universite> getFoyer() {
        return UniversiteService.getUniversite();
    }
}
