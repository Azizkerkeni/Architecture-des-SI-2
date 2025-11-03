package tn.esprit.medaziz_kerkeni_4gamix1.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Etudiant;
import tn.esprit.medaziz_kerkeni_4gamix1.services.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("/api/Etudiant")
@AllArgsConstructor
public class EtudiantController {

    private final EtudiantService EtudiantService;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant Etudiant) {
        return EtudiantService.ajouteretudiant(Etudiant);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateChambre(@RequestBody Etudiant Etudiant) {
        return EtudiantService.modifieretudiant(Etudiant);
    }


    @DeleteMapping("/deleteEtudiant/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        EtudiantService.supprimeretudiant(id);
    }

    @GetMapping("/getEtudiant/{id}")
    public Etudiant getEtudiant(@PathVariable Long id) {
        return EtudiantService.getetudiant(id);
    }

    @GetMapping("/getEtudiant")
    public List<Etudiant> getEtudiant() {
        return EtudiantService.getEtudiant();
    }

}
