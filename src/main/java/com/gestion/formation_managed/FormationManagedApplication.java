package com.gestion.formation_managed;

import com.gestion.formation_managed.dao.ElementsRepository;
import com.gestion.formation_managed.dao.FormationRepository;
import com.gestion.formation_managed.entities.ElementForm;
import com.gestion.formation_managed.entities.Formation;
import com.gestion.formation_managed.entities.CVFormateur;
import com.gestion.formation_managed.entities.Inscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class FormationManagedApplication  implements CommandLineRunner{

    @Autowired
    private FormationRepository formationRepository;//Pour exposer le id du produit a chaque affichage dans le formar Json
    @Autowired
    private ElementsRepository elementsRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) { SpringApplication.run(FormationManagedApplication.class, args); }


    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(ElementForm.class);
        repositoryRestConfiguration.exposeIdsFor(CVFormateur.class);
        repositoryRestConfiguration.exposeIdsFor(Inscription.class);
        repositoryRestConfiguration.exposeIdsFor(Formation.class);
    }
}
