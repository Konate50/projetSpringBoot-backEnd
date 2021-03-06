package com.gestion.formation_managed.dao;

import com.gestion.formation_managed.entities.Evaluation;
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
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
    /*//recherche pas id
    @RestResource(path = "/byCompetence")
    public List<Evaluation> findByCompetenceContains(@Param("mc") String competence);

    //recherce pas pagegignation
    @RestResource(path = "/byCompetencePage")
    public Page<Evaluation> findByCompetenceContains(@Param("mc") String competence, Pageable pageable);
*/
}
