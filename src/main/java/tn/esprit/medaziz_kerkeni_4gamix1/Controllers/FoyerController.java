package tn.esprit.medaziz_kerkeni_4gamix1.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Foyer;
import tn.esprit.medaziz_kerkeni_4gamix1.services.FoyerService;

import java.util.List;

@RestController
@RequestMapping("/api/Foyer")
@AllArgsConstructor
public class FoyerController {

    private final FoyerService FoyerService;

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer Foyer) {
        return FoyerService.ajouterfoyer(Foyer);
    }

    @PutMapping("/updateFoyer")
    public Foyer updateChambre(@RequestBody Foyer Foyer) {
        return FoyerService.modifierfoyer(Foyer);
    }


    @DeleteMapping("/deleteFoyer/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        FoyerService.supprimerfoyer(id);
    }

    @GetMapping("/getEtudiant/{id}")
    public Foyer getEtudiant(@PathVariable Long id) {
        return FoyerService.getfoyer(id);
    }

    @GetMapping("/getEtudiant")
    public List<Foyer> getFoyer() {
        return FoyerService.getFoyer();
    }

}