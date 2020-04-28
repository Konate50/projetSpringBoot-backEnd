package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.ElementsRepository;
import com.gestion.formation_managed.entities.ElementForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ElementsService {
    @Autowired
    private ElementsRepository elementsRepository;

    @GetMapping(value = "/listElements")
    public List<ElementForm> listElements(){
        return elementsRepository.findAll();
    }
}
