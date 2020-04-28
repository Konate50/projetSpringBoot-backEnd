package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.CvRepository;
import com.gestion.formation_managed.entities.CVFormateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CvService {

    @Autowired
    private CvRepository cvRepository;

    //Affichage de la liste de tous les plans
    @GetMapping(value = "/listPlans")
    public List<CVFormateur> listPlans(){
        return cvRepository.findAll();
    }
    //Consulter un plan
    @GetMapping(value = "/listPlans/{id}")
    public CVFormateur listPlans(@PathVariable(name = "id") Long id){
        return cvRepository.findById(id).get();
    }
    //pour mettre a jour un produit
    @PutMapping(value = "/listPlans/{id}")
    public CVFormateur update(@PathVariable(name = "id") Long id, @RequestBody CVFormateur p){
        p.setId(id);
        return cvRepository.save(p);
    }
    //Pour ajouter des produits
    @PostMapping(value = "/listPlans")
    public CVFormateur save(@RequestBody CVFormateur p){
        return cvRepository.save(p);
    }
    @DeleteMapping(value = "/listPlans/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        cvRepository.deleteById(id);
    }
}
