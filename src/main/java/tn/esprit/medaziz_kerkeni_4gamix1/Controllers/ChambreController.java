package tn.esprit.medaziz_kerkeni_4gamix1.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Chambre;
import tn.esprit.medaziz_kerkeni_4gamix1.services.ChambreService;

import java.util.List;

@RestController
@RequestMapping("/api/Chambre")
@AllArgsConstructor
public class ChambreController {

    private final ChambreService ChambreService;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre Chambre) {
        return ChambreService.ajouterchambre(Chambre);
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre Chambre) {
        return ChambreService.modifierchambre(Chambre);
    }


    @DeleteMapping("/deleteChambre/{id}")
    public void deleteChambre(@PathVariable Long id) {
        ChambreService.supprimerchambre(id);
    }

    @GetMapping("/getchambre/{id}")
    public Chambre getchambre(@PathVariable Long id) {
        return ChambreService.getchambre(id);
    }

    @GetMapping("/getChambre")
    public List<Chambre> getChambre() {
        return ChambreService.getChambre();
    }

}
