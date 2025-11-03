package tn.esprit.medaziz_kerkeni_4gamix1.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.medaziz_kerkeni_4gamix1.entity.Bloc;
import tn.esprit.medaziz_kerkeni_4gamix1.services.BlocService;

import java.util.List;

@RestController
@RequestMapping("/api/Bloc")
@AllArgsConstructor

public class BlocController {

    private final BlocService blocService;

    @PostMapping("/addBloc")
        public Bloc addBloc(@RequestBody Bloc bloc) {
            return blocService.ajouterBloc(bloc);
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.modifierBloc(bloc);
    }


    @DeleteMapping("/deleteBloc/{id}")
    public void deleteBloc(@PathVariable Long id) {
         blocService.supprimerBloc(id);
    }

    @GetMapping("/getBloc/{id}")
    public Bloc getBloc(@PathVariable Long id) {
        return blocService.getBloc(id);
    }

    @GetMapping("/getBlocs")
    public List<Bloc> getBlocs() {
        return blocService.getBlocs();
    }




}
