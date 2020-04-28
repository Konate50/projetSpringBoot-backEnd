package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.CVFormateur;
import com.gestion.formation_managed.entities.ElementForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@RepositoryRestResource
public interface CvRepository extends JpaRepository<CVFormateur, Long> {
    //recherche pas id
    @RestResource(path = "/byCv")
    public List<CVFormateur> findByCompetencesContains(@Param("mc") String des);
    @RestResource(path = "/cVSelected")
    public List<CVFormateur> findBySelectedIsTrue();
    //recherce pas pagegignation
    @RestResource(path = "/byCvPage")
    public Page<CVFormateur> findByCompetencesContains(@Param("mc") String des, Pageable pageable);

}
