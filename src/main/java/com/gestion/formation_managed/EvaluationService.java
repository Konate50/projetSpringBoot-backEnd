package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.EvaluationRepository;
import com.gestion.formation_managed.entities.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EvaluationService {
    @Autowired
    private EvaluationRepository evaluationRepository;
    //Affichage de la liste de tous les produits
    @GetMapping(value = "/listEvaluations")
    public List<Evaluation> listEvaluations(){
        return evaluationRepository.findAll();
    }
    //Consulter un produit
    @GetMapping(value = "/listEvaluations/{id}")
    public Evaluation listEvaluations(@PathVariable(name = "id") Long id){
        return evaluationRepository.findById(id).get();
    }
    //pour mettre a jour un produit
    @PutMapping(value = "/listEvaluations/{id}")
    public Evaluation update(@PathVariable(name = "id") Long id, @RequestBody Evaluation e){
        e.setId(id);
        return evaluationRepository.save(e);
    }
    //Pour ajouter des produits
    @PostMapping(value = "/listEvaluations")
    public Evaluation save(@RequestBody Evaluation e){
        return evaluationRepository.save(e);
    }
    @DeleteMapping(value = "/listEvaluations/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        evaluationRepository.deleteById(id);
    }
}
