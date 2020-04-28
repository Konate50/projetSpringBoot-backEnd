package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.FormationRepository;
import com.gestion.formation_managed.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FormationService {
    @Autowired
    private FormationRepository formationRepository;

    //Affichage de la liste de tous les formations
    @GetMapping(value = "/listFormations")
    public List<Formation> listFormations(){
        return formationRepository.findAll();
    }
    //Consulter une formation par id
    @GetMapping(value = "/listFormations/{id}")
    public Formation listFormations(@PathVariable(name = "id") Long id){
        return formationRepository.findById(id).get();
    }
    //pour mettre a jour une formation
    @PutMapping(value = "/listFormations/{id}")
    public Formation update(@PathVariable(name = "id") Long id, @RequestBody Formation f){
        f.setId(id);
        return formationRepository.save(f);
    }
    //Pour ajouter des formations
    @PostMapping(value = "/listFormations")
    public Formation save(@RequestBody Formation f){
        return formationRepository.save(f);
    }
    //Pour la suppression
    @DeleteMapping(value = "/listFormations/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        formationRepository.deleteById(id);
    }
}
