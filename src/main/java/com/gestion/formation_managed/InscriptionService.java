package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.InscriptionRepository;
import com.gestion.formation_managed.entities.Inscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InscriptionService {
    @Autowired
    private InscriptionRepository inscriptionRepository;

    //Affichage de la liste de tous les inscrits
    @GetMapping(value = "/listInscrits")
    public List<Inscription> listInscrits(){
        return inscriptionRepository.findAll();
    }

    //Pour ajouter des inscriptions
    @PostMapping(value = "/listInscrits")
    public Inscription save(@RequestBody Inscription i){
        return inscriptionRepository.save(i);
    }
}
